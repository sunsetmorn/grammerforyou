package grammar.thread.method;

import grammar.test.hero.herotemplate.Hero;

/**
 * ��ʱ��ͣʹ��cpu.
 *
 */
public class TestYield {
    public static void main(String[] args) {
        Hero gareen = new Hero("����",616,1);
        Hero teemo = new Hero("��Ī",30000,30);
        Hero bh = new Hero("�ͽ�����",500,1);
        Hero leesin = new Hero("äɮ",45500,80);
        Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                    //��ʱ��ͣ��ʹ��t2����ռ��CPU��Դ
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
