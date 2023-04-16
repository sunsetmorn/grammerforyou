package grammar.thread.modeforimplemetation;

import grammar.test.behavior.HeroKillRunnable;
import grammar.test.hero.herotemplate.Hero;
/**
 * 实现runnable的多线程方式
 */
public class TestMutilpleThread2 {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦",616,50);
        Hero teemo = new Hero("提莫",300,30);
        Hero bh = new Hero("赏金猎人",500,65);
        Hero leesin = new Hero("盲僧",455,80);

        System.out.println("实现runnable的多线程方式：");
        HeroKillRunnable r1 = new HeroKillRunnable(gareen,teemo);
        new Thread(r1).start();
        HeroKillRunnable r2 =new HeroKillRunnable(bh,leesin);
        new Thread(r2).start();
    }
}
