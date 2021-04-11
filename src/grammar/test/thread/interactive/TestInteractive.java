package grammar.test.thread.interactive;

import grammar.material.hero.herotemplate.Hero;

/**
 * ������Ҫǿ�����ǣ�wait������notify������������Thread�߳��ϵķ�����������Object�ϵķ�����
 * ��Ϊ���е�Object�����Ա�������Ϊͬ����������׼ȷ�Ľ���wait��notify��ͬ�������ϵķ�����
 * wait()����˼�ǣ� ��ռ�������ͬ��������̣߳���ʱ�ͷŵ�ǰ��ռ�ã����ҵȴ��� ���Ե���wait����ǰ�������ģ�һ������synchronized�������ͻ����
 * notify() ����˼�ǣ�֪ͨһ���ȴ������ͬ�������ϵ��̣߳���������ѹ����ˣ��л�������ռ�õ�ǰ�����ˡ�
 * notifyAll() ����˼�ǣ�֪ͨ���еĵȴ������ͬ�������ϵ��̣߳����ǿ������ѹ����ˣ��л�������ռ�õ�ǰ�����ˡ�
 *
 */
public class TestInteractive {
    public static void main(String[] args) {

        Hero gareen = new Hero("����",616,1);
        Thread t1 = new Thread(){
            public void run(){
                while(true){

                    gareen.swhurt();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    gareen.swrecover();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t2.start();

    }
}
