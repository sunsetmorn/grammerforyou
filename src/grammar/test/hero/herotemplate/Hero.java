package grammar.test.hero.herotemplate;

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

    public void attackHero(Hero h) {
//        try {
//            //Ϊ�˱�ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000����
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);

        if(h.isDead())
            System.out.println(h.name +"���ˣ�");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

    //��ͬ���� ��Ѫ
    public void recover(){
        hp=hp+1;
    }

    //��ͬ���� ��Ѫ
    public void hurt(){
        hp=hp-1;
    }

    //ͬ���� ��Ѫ ,ͬ���ķ���������ڸö�����ͬ��������ֱ�ӷ��ڷ���ǰ����
    public synchronized void srecover(){
        hp=hp+1;
    }

    //ͬ���� ��Ѫ�������ڷ�������ͬ��
    /**
     * ��recoverǰ��ֱ�Ӽ���synchronized ��������Ӧ��ͬ�����󣬾���this
     * ��hurt�����ﵽ��Ч����һ��
     * �ⲿ�̷߳���gareen�ķ������Ͳ���Ҫ����ʹ��synchronized ��
     *
     * ���һ���࣬�䷽��������synchronized���εģ���ô����ͽ����̰߳�ȫ����
     * ͬһʱ�䣬ֻ��һ���߳��ܹ����� �������һ��ʵ�� ��ȥ�޸����ݣ�������֤�����ʵ���е����ݵİ�ȫ(����ͬʱ�����߳��޸Ķ����������)
     * ����StringBuffer��StringBuilder������
     * StringBuffer�ķ���������synchronized���εģ�StringBuffer�ͽ����̰߳�ȫ����
     * ��StringBuilder�Ͳ����̰߳�ȫ����
     */
    public void shurt(){
        //ʹ��this��Ϊͬ������
        synchronized (this) {
            hp=hp-1;
        }
    }

    //ͬ���ļ��Ͻ����Ļ�Ѫ
    public synchronized void swrecover() {
        if (hp == 1000) {
            try {
                // ��ռ��this�ļ�Ѫ�̣߳���ʱ�ͷŶ�this��ռ�У����ȴ�
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        hp = hp + 1;
        System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
        // ֪ͨ��Щ�ȴ���this�����ϵ��̣߳������ѹ����ˣ����20�У��ȴ��ŵļ�Ѫ�̣߳����ѹ���
        this.notify();
    }
    //ͬ���ļ��Ͻ����ĵ�Ѫ
    public synchronized void swhurt() {
        if (hp == 1) {
            try {
                // ��ռ��this�ļ�Ѫ�̣߳���ʱ�ͷŶ�this��ռ�У����ȴ�
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        hp = hp - 1;
        System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
        this.notify();
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
//        return "{" +name +"��Ѫ����"+ healthValue + "}";
//    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
}
