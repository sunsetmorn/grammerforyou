package grammar.test.thread.interactive;

import grammar.material.hero.herotemplate.Hero;

/**
 * 这里需要强调的是，wait方法和notify方法，并不是Thread线程上的方法，它们是Object上的方法。
 * 因为所有的Object都可以被用来作为同步对象，所以准确的讲，wait和notify是同步对象上的方法。
 * wait()的意思是： 让占用了这个同步对象的线程，临时释放当前的占用，并且等待。 所以调用wait是有前提条件的，一定是在synchronized块里，否则就会出错。
 * notify() 的意思是，通知一个等待在这个同步对象上的线程，你可以苏醒过来了，有机会重新占用当前对象了。
 * notifyAll() 的意思是，通知所有的等待在这个同步对象上的线程，你们可以苏醒过来了，有机会重新占用当前对象了。
 *
 */
public class TestInteractive {
    public static void main(String[] args) {

        Hero gareen = new Hero("盖伦",616,1);
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
