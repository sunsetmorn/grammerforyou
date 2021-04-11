package grammar.test.thread.interactive;

import grammar.material.hero.herotemplate.Hero;

public class PracticeInteractive {
    public static void main(String[] args) {
        Hero gareen = new Hero("¸ÇÂ×",616,1);
        for(int i=0;i<5;i++){
            Thread t1 = new Thread(){
                public void run(){
                    while(true){
                        gareen.swhurt();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            };
            t1.start();
        }

        for(int i=0;i<2;i++) {
            Thread t2 = new Thread() {
                public void run() {
                    while (true) {
                        gareen.swrecover();
                        try {
                            Thread.sleep(10);
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
}
