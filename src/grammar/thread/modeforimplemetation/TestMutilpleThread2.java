package grammar.thread.modeforimplemetation;

import grammar.test.behavior.HeroKillRunnable;
import grammar.test.hero.herotemplate.Hero;
/**
 * ʵ��runnable�Ķ��̷߳�ʽ
 */
public class TestMutilpleThread2 {
    public static void main(String[] args) {
        Hero gareen = new Hero("����",616,50);
        Hero teemo = new Hero("��Ī",300,30);
        Hero bh = new Hero("�ͽ�����",500,65);
        Hero leesin = new Hero("äɮ",455,80);

        System.out.println("ʵ��runnable�Ķ��̷߳�ʽ��");
        HeroKillRunnable r1 = new HeroKillRunnable(gareen,teemo);
        new Thread(r1).start();
        HeroKillRunnable r2 =new HeroKillRunnable(bh,leesin);
        new Thread(r2).start();
    }
}
