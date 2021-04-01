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
        System.out.println("存入对象："+myStack.heroes);
        System.out.println("-----------------------");
        System.out.println("取出最后一位对象："+myStack.pull());
        System.out.println("-----------------------");
        if (myStack!=null)
            System.out.println("查看最后一个英雄"+myStack.peek());
    }

}
