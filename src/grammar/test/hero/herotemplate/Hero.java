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
//            //为了表示攻击需要时间，每次攻击暂停1000毫秒
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);

        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

    //不同步的 回血
    public void recover(){
        hp=hp+1;
    }

    //不同步的 掉血
    public void hurt(){
        hp=hp-1;
    }

    //同步的 回血 ,同步的方法如果对于该对象做同步，可以直接放在方法前修饰
    public synchronized void srecover(){
        hp=hp+1;
    }

    //同步的 掉血，可以在方法内做同步
    /**
     * 在recover前，直接加上synchronized ，其所对应的同步对象，就是this
     * 和hurt方法达到的效果是一样
     * 外部线程访问gareen的方法，就不需要额外使用synchronized 了
     *
     * 如果一个类，其方法都是有synchronized修饰的，那么该类就叫做线程安全的类
     * 同一时间，只有一个线程能够进入 这种类的一个实例 的去修改数据，进而保证了这个实例中的数据的安全(不会同时被多线程修改而变成脏数据)
     * 比如StringBuffer和StringBuilder的区别
     * StringBuffer的方法都是有synchronized修饰的，StringBuffer就叫做线程安全的类
     * 而StringBuilder就不是线程安全的类
     */
    public void shurt(){
        //使用this作为同步对象
        synchronized (this) {
            hp=hp-1;
        }
    }

    //同步的加上交互的回血
    public synchronized void swrecover() {
        if (hp == 1000) {
            try {
                // 让占有this的减血线程，暂时释放对this的占有，并等待
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        hp = hp + 1;
        System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
        // 通知那些等待在this对象上的线程，可以醒过来了，如第20行，等待着的减血线程，苏醒过来
        this.notify();
    }
    //同步的加上交互的掉血
    public synchronized void swhurt() {
        if (hp == 1) {
            try {
                // 让占有this的减血线程，暂时释放对this的占有，并等待
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        hp = hp - 1;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
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
//        return "{" +name +"的血量是"+ healthValue + "}";
//    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
}
