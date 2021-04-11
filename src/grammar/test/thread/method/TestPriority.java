package grammar.test.thread.method;

import grammar.material.hero.herotemplate.Hero;

/**
 * 当线程处于竞争关系的时候，优先级高的线程会有更大的几率获得CPU资源
 * 为了演示该效果，要把暂停时间去掉，多条线程各自会尽力去占有CPU资源
 * 同时把英雄的血量增加100倍，攻击减低到1，才有足够的时间观察到优先级的演示
 * 如图可见，线程1的优先级是MAX_PRIORITY，所以它争取到了更多的CPU资源执行代码
 *
 * 线程优先级最大值Thread.MAX_PRIORITY为10，最小值Thread.MIN_PRIORITY为1，除此1-10以外的值会报错（仅是整形)
 */
public class TestPriority {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦",616,1);
        Hero teemo = new Hero("提莫",30000,30);
        Hero bh = new Hero("赏金猎人",500,1);
        Hero leesin = new Hero("盲僧",45500,80);
        Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        System.out.println("优先级常数为："+Thread.MAX_PRIORITY +":::"+ Thread.MIN_PRIORITY);
    }


}
