package grammar.behavior;

import grammar.material.hero.herotemplate.Hero;

/**
 * 实现runnable的方式实现多线程，由于runnable中没有start()方法，
 * 所以需要新建一个Thread类来使用start()方法
 */
public class HeroKillRunnable implements Runnable{
    private Hero h1;
    private Hero h2 ;

    public HeroKillRunnable(Hero h1,Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while (!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
