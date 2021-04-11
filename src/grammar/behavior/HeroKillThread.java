package grammar.behavior;

import grammar.material.hero.herotemplate.Hero;

/**
 * 多线程实现方式1：继承 Thread类，由于Thread类有start()方法，
 *                所以可以直接使用start()创建一个线程
 */
public class HeroKillThread extends Thread{
    private Hero h1;
    private Hero h2;

    public HeroKillThread(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
