package grammar.test.Collection.linkedlist;

import grammar.material.Hero;
import grammar.test.Collection.UtilInterface.Stack;

import java.util.LinkedList;

public class HeroStack implements Stack<Hero> {
    private LinkedList<Hero> heroes = new LinkedList<>();

    @Override
    public void push(Hero hero) {
        heroes.addLast(hero);
    }

    @Override
    public Hero pull() {
        return heroes.removeLast();
    }

    @Override
    public Hero peek() {
        return heroes.getLast();
    }

    public static void main(String[] args) {
        HeroStack myStack = new HeroStack();
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
