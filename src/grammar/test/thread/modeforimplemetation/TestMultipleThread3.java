package grammar.test.thread.modeforimplemetation;

import grammar.material.hero.herotemplate.Hero;

/**
 * ʹ���������ʵ�ֶ��߳�
 */
public class TestMultipleThread3 {
    public static void main(String[] args) {
        Hero gareen = new Hero("����",616,50);
        Hero teemo = new Hero("��Ī",300,30);
        Hero bh = new Hero("�ͽ�����",500,65);
        Hero leesin = new Hero("äɮ",455,80);

        Thread t1 = new Thread(){
            public void run(){
                //���������õ��ⲿ�ľֲ�����teemo�������teemo����Ϊfinal
                //������JDK7�Ժ󣬾Ͳ��Ǳ����final����
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                //���������õ��ⲿ�ľֲ�����teemo�������teemo����Ϊfinal
                //������JDK7�Ժ󣬾Ͳ��Ǳ����final����
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };
        t2.start();
    }
}
