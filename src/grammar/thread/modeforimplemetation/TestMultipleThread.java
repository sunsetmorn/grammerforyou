package grammar.thread.modeforimplemetation;

import grammar.test.behavior.HeroKillThread;
import grammar.test.hero.herotemplate.Hero;

/**
 * �̳� Thread��ʵ�ֶ��߳�
 */
public class TestMultipleThread {
    public static void main(String[] args) {
        Hero gareen = new Hero("����",616,50);
        Hero teemo = new Hero("��Ī",300,30);
        Hero bh = new Hero("�ͽ�����",500,65);
        Hero leesin = new Hero("äɮ",455,80);

        System.out.println("�̳� Thread��ʵ�ֶ��̵߳ķ�ʽ��");
        HeroKillThread t1 = new HeroKillThread(gareen,teemo);
        t1.start();
        HeroKillThread t2 = new HeroKillThread(bh,leesin);
        t2.start();

    }
}
