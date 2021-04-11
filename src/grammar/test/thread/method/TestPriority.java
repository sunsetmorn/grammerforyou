package grammar.test.thread.method;

import grammar.material.hero.herotemplate.Hero;

/**
 * ���̴߳��ھ�����ϵ��ʱ�����ȼ��ߵ��̻߳��и���ļ��ʻ��CPU��Դ
 * Ϊ����ʾ��Ч����Ҫ����ͣʱ��ȥ���������̸߳��Իᾡ��ȥռ��CPU��Դ
 * ͬʱ��Ӣ�۵�Ѫ������100�����������͵�1�������㹻��ʱ��۲쵽���ȼ�����ʾ
 * ��ͼ�ɼ����߳�1�����ȼ���MAX_PRIORITY����������ȡ���˸����CPU��Դִ�д���
 *
 * �߳����ȼ����ֵThread.MAX_PRIORITYΪ10����СֵThread.MIN_PRIORITYΪ1������1-10�����ֵ�ᱨ����������)
 */
public class TestPriority {
    public static void main(String[] args) {
        Hero gareen = new Hero("����",616,1);
        Hero teemo = new Hero("��Ī",30000,30);
        Hero bh = new Hero("�ͽ�����",500,1);
        Hero leesin = new Hero("äɮ",45500,80);
        Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
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

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        System.out.println("���ȼ�����Ϊ��"+Thread.MAX_PRIORITY +":::"+ Thread.MIN_PRIORITY);
    }


}
