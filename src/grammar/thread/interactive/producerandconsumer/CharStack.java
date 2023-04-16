package grammar.thread.interactive.producerandconsumer;

import grammar.Collection.UtilInterface.Stack;

import java.util.LinkedList;
import java.util.List;

public class CharStack implements Stack<Character> {

    private LinkedList<Character> characters = new LinkedList<>();


    //���
    @Override
    public synchronized void push(Character t){
        if(characters.size() >= 200){
            try {
                // ��ռ��this�ļ�Ѫ�̣߳���ʱ�ͷŶ�this��ռ�У����ȴ�
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        characters.addLast(t);
        this.notifyAll();
    };
    //ȡ�����鿴��ȥ����
    @Override
    public synchronized Character pull(){
        if(characters.size() <= 0) {
            try {
                // ��ռ��this�ļ�Ѫ�̣߳���ʱ�ͷŶ�this��ռ�У����ȴ�
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.notifyAll();
        return characters.removeLast();
    };
    //�鿴
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
