package grammar.thread.method;

import grammar.test.hero.herotemplate.Hero;

/**
 * 临时暂停使用cpu.
 *
 */
public class TestYield {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦",616,1);
        Hero teemo = new Hero("提莫",30000,30);
        Hero bh = new Hero("赏金猎人",500,1);
        Hero leesin = new Hero("盲僧",45500,80);
        Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                    //临时暂停，使得t2可以占用CPU资源
                    Thread.yield();
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
        t1.setPriority(6);
        t2.setPriority(5);
        t1.start();
        t2.start();
    }
}
