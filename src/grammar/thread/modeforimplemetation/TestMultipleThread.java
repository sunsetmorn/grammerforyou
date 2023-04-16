package grammar.thread.modeforimplemetation;

import grammar.test.behavior.HeroKillThread;
import grammar.test.hero.herotemplate.Hero;

/**
 * 继承 Thread类实现多线程
 */
public class TestMultipleThread {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦",616,50);
        Hero teemo = new Hero("提莫",300,30);
        Hero bh = new Hero("赏金猎人",500,65);
        Hero leesin = new Hero("盲僧",455,80);

        System.out.println("继承 Thread类实现多线程的方式：");
        HeroKillThread t1 = new HeroKillThread(gareen,teemo);
        t1.start();
        HeroKillThread t2 = new HeroKillThread(bh,leesin);
        t2.start();

    }
}
