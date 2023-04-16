package grammar.thread.interactive.producerandconsumer;

public class Consumer extends Thread{

    private CharStack cs;
    private String threadName;

    public Consumer(){}

    public Consumer(CharStack c){
        this.cs =c;
    }

    public Consumer(CharStack c,String tn){
        this.cs =c;
        this.threadName =tn;
    }

    @Override
    public void run(){
        while (true){
            Character ca =cs.pull();
            System.out.println("消费者["+threadName+"]消费了："+ca);
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
