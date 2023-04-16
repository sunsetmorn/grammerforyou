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
        System.out.println("存入对象："+myStack.heroes);
        System.out.println("-----------------------");
        System.out.println("取出最后一位对象："+myStack.pull());
        System.out.println("-----------------------");
        if (myStack!=null)
            System.out.println("查看最后一个英雄"+myStack.peek());
    }

}
