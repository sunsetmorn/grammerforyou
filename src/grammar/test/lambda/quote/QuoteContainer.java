package grammar.test.lambda.quote;

import grammar.material.Hero;
import grammar.test.lambda.knowlambda.HeroChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteContainer {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        System.out.println("Lambda表达式：");
        filter(heros,h-> h.getHp()>100 && h.getDamage()<50 );

        System.out.println("Lambda表达式中调用容器中的对象的matched方法：");
        filter(heros,h-> h.matched() );

        System.out.println("引用容器中对象的方法 之过滤结果：");
        filter(heros, Hero::matched);
    }

    public boolean testHero(Hero h) {
        return h.getHp()>100 && h.getDamage()<50;
    }

    private static void filter(List<Hero> heros, HeroChecker checker) {
        for (Hero hero : heros) {
            if (checker.test(hero))
                System.out.print(hero);
        }
    }
}
