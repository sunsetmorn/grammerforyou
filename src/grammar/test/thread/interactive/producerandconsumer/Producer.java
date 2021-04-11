package grammar.test.thread.interactive.producerandconsumer;

import java.util.Random;

public class Producer extends Thread{
    private CharStack cs;
    private String threadName;

    public Producer(){}

    public Producer(CharStack c){
        this.cs =c;
    }

    public Producer(CharStack c,String tn){
        this.cs =c;
        this.threadName = tn;
    }

    @Override
    public void run(){
        while (true){
            Random r = new Random();
            Integer i =r.nextInt(26);
            Character a = (char)(i + 65);
            cs.push(a);
            System.out.println("生产者["+threadName+"]生产了: "+a);
        }
    }

    public CharStack getCs() {
        return cs;
    }

    public void setCs(CharStack cs) {
        this.cs = cs;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
