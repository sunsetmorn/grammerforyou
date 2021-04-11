package grammar.test.thread.synchronize;

import grammar.material.hero.herotemplate.Hero;

public class TestSafe {
    public static void main(String[] args) {
        //������
        final Object someObject = new Object();
        final Hero gareen = new Hero("����",10000,1);
        int n = 10000;
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //�κ��߳�Ҫ�޸�hp��ֵ��������ռ��someObject
                    synchronized (someObject) {
                        gareen.recover();
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
        }

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //����ʹ����Ҫ�޸ĵĶ�������Ϊ��
                    synchronized (gareen) {
                        gareen.hurt();
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }
        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.printf("%d�������̺߳�%d�������߳̽�����%n���׵�Ѫ���� %.0f%n", n,n,gareen.getHp());

    }
}
