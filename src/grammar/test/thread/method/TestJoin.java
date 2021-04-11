package grammar.test.thread.method;

import grammar.material.hero.herotemplate.Hero;

public class TestJoin {
    /**
     * ���Ƚ���һ�����̵߳ĸ���
     * ���н��̣����ٻ���һ���̼߳����̣߳���main������ʼִ�У��ͻ���һ�������������̴߳��ڡ�
     * �������߳�ִ��t.join�������������߳��м�����̡߳�
     * ���̻߳�ȴ����߳̽�����ϣ� �Ż��������С�
     */

    public static void main(String[] args) {
        Hero gareen = new Hero("����",616,50);
        Hero teemo = new Hero("��Ī",300,30);
        Hero bh = new Hero("�ͽ�����",500,65);
        Hero leesin = new Hero("äɮ",455,80);

        Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };
        t1.start();
        //����ִ�е����һֱ��main�߳�������
        try {
            //t1�̼߳��뵽main�߳�������ֻ��t1�߳����н������Ż����������
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };
        //��۲쵽���װ���Īɱ���󣬲�����t2�߳�
        t2.start();
    }
}
