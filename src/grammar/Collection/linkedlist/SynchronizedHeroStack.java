package grammar.Collection.linkedlist;

import grammar.test.hero.herotemplate.Hero;
import grammar.Collection.UtilInterface.Stack;

import java.util.LinkedList;

public class SynchronizedHeroStack  implements Stack<Hero>{
    private LinkedList<Hero> heroes = new LinkedList<>();

    @Override
    public synchronized void push(Hero hero) {
        heroes.addLast(hero);
    }

    @Override
    public synchronized Hero pull() {
        return heroes.removeLast();
    }

    @Override
    public synchronized Hero peek() {
        return heroes.getLast();
    }

    public static void main(String[] args) {
        SynchronizedHeroStack myStack = new SynchronizedHeroStack();
        for (int i = 0; i < 5; i++) {
            myStack.push(new Hero("hero name "+i));
        }
        System.out.println("�������"+myStack.heroes);
        System.out.println("-----------------------");
        System.out.println("ȡ�����һλ����"+myStack.pull());
        System.out.println("-----------------------");
        if (myStack!=null)
            System.out.println("�鿴���һ��Ӣ��"+myStack.peek());
    }

}
