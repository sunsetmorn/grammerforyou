package grammar.test.thread.interactive;

import grammar.material.hero.herotemplate.Hero;

public class TestUnInteractive {
    public static void main(String[] args) {

        final Hero gareen = new Hero("����",616,1);

        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    //��Ϊ��Ѫ���죬���Ը��׵�Ѫ������ᵽ��1
                    //ʹ��whileѭ���ж��Ƿ���1�������1�Ͳ�ͣ��ѭ��
                    //ֱ����Ѫ�̻߳ظ���Ѫ��
                    while(gareen.getHp()==1){
                        continue;
                    }
                    gareen.hurt();
                    System.out.printf("t1 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.getName(),gareen.getName(),gareen.getHp());
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
                    gareen.recover();
                    System.out.printf("t2 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.getName(),gareen.getName(),gareen.getHp());
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
