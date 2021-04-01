package grammar.test.Collection.linkedlist;

import grammar.material.Hero;

import java.util.LinkedList;
import java.util.Queue;

public class HeroLinkedList {
    public static void main(String[] args) {

        //LinkedList��һ��˫������ṹ��list
        LinkedList<Hero> ll =new LinkedList<Hero>();
        //���Կ��Ժܷ������ͷ����β����������
        //���������µ�Ӣ��
        ll.addLast(new Hero("hero1"));
        ll.addLast(new Hero("hero2"));
        ll.addLast(new Hero("hero3"));
        System.out.println(ll);
        //����ǰ������µ�Ӣ��
        ll.addFirst(new Hero("heroX"));
        System.out.println(ll);
        //�鿴��ǰ���Ӣ��
        System.out.println(ll.getFirst());
        //�鿴������Ӣ��
        System.out.println(ll.getLast());
        //�鿴���ᵼ��Ӣ�۱�ɾ��
        System.out.println(ll);
        //ȡ����ǰ���Ӣ��
        System.out.println(ll.removeFirst());
        //ȡ��������Ӣ��
        System.out.println(ll.removeLast());
        //ȡ���ᵼ��Ӣ�۱�ɾ��
        System.out.println(ll);


        //����ͬ����LinkedList��ʵ����Deque��������ʵ����Queue����ӿ�
        //Queue����FIFO �Ƚ��ȳ��Ķ���
        Queue<Hero> q= new LinkedList<Hero>();

        //���ڶ��е������
        System.out.print("��ʼ�����У�\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));

        System.out.println(q);
        System.out.print("�ѵ�һ��Ԫ��ȡpoll()����:\t");
        //ȡ����һ��Hero��FIFO �Ƚ��ȳ�
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("ȡ����һ��Ԫ��֮��Ķ���:\t");
        System.out.println(q);

        //�ѵ�һ���ó�����һ�������ǲ�ȡ����
        h=q.peek();
        System.out.print("�鿴peek()��һ��Ԫ��:\t");
        System.out.println(h);
        System.out.print("�鿴�����ᵼ�µ�һ��Ԫ�ر�ȡ����:\t");
        System.out.println(q);
    }
}
