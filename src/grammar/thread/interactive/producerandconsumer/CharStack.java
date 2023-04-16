package grammar.thread.interactive.producerandconsumer;

import grammar.Collection.UtilInterface.Stack;

import java.util.LinkedList;
import java.util.List;

public class CharStack implements Stack<Character> {

    private LinkedList<Character> characters = new LinkedList<>();


    //添加
    @Override
    public synchronized void push(Character t){
        if(characters.size() >= 200){
            try {
                // 让占有this的减血线程，暂时释放对this的占有，并等待
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        characters.addLast(t);
        this.notifyAll();
    };
    //取出（查看并去除）
    @Override
    public synchronized Character pull(){
        if(characters.size() <= 0) {
            try {
                // 让占有this的减血线程，暂时释放对this的占有，并等待
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.notifyAll();
        return characters.removeLast();
    };
    //查看
    @Override
    public synchronized Character peek(){
        return characters.getLast();
    };

    public Integer getSize(){
        return characters.size();
    }
    public List getList(){
        return characters;
    }
}
