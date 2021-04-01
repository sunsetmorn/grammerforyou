package grammar.material;

public class Hero {
    private String name;
    private Double aggressivity;
    private Double armor;
    private Integer healthValue;
    private float hp;
    private int damage;


    public Hero(){};
    public Hero(String name){
        this.name = name;
    }

    public Hero(String name, Integer healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    public Hero(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    public boolean matched(){
        return this.hp>100 && this.damage<50;
    }
    public static int compare(Hero o1,Hero o2){
        return o1.getHp()>o2.getHp()?1:-1;
    }
    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(Double aggressivity) {
        this.aggressivity = aggressivity;
    }

    public Double getArmor() {
        return armor;
    }

    public void setArmor(Double armor) {
        this.armor = armor;
    }

    public Integer getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(Integer healthValue) {
        this.healthValue = healthValue;
    }

//    @Override
//    public String toString() {
//        return "{" +name +"µÄÑªÁ¿ÊÇ"+ healthValue + "}";
//    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
}
