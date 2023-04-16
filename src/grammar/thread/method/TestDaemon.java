package grammar.thread.method;

/**
 * �ػ��̵߳ĸ����ǣ� ��һ����������е��̶߳����ػ��̵߳�ʱ�򣬽�����ǰ���̡�
 * �Ǳ����߳�
 *
 * �ͺ���һ����˾�����۲�����������Щ��ҵ��ҹ��Ĳ��š�
 * ����֮�⣬���к��ڣ���������Щ֧�ֲ��š�
 * ���һ�ҹ�˾���۲�������������ɢ�ˣ���ôֻʣ�º��ں���������ô��ҹ�˾Ҳ���Խ�ɢ�ˡ�
 * �ػ��߳̾��൱����Щ֧�ֲ��ţ����һ������ֻʣ���ػ��̣߳���ô���̾ͻ��Զ�������
 * �ػ��߳�ͨ���ᱻ��������־������ͳ�Ƶȹ�����
 */
public class TestDaemon {
    public static void main(String[] args) {
        Thread t1= new Thread(){
            public void run(){
                int seconds =0;

                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("�Ѿ�����LOL %d ��%n", seconds++);

                }
            }
        };
        t1.setDaemon(true);
        t1.start();
    }
}
