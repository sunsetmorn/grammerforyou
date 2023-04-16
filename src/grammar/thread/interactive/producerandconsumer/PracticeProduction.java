package grammar.thread.interactive.producerandconsumer;

public class PracticeProduction {
    public static void main(String[] args) {
        CharStack cs = new CharStack();

        for(int i=0;i<3;i++){
            Consumer con = new Consumer(cs,"消费者"+i);
            con.start();
        }

        for(int i=0;i<2;i++){
            Producer pro = new Producer(cs,"生产者"+i);
            pro.start();
        }

    }
}
