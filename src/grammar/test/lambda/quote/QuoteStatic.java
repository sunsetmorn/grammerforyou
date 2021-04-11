package grammar.test.lambda.quote;

import grammar.material.hero.herotemplate.Hero;
import grammar.test.lambda.knowlambda.HeroChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteStatic {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        HeroChecker c = new HeroChecker() {
            public boolean test(Hero h) {
                return h.getHp()>100 && h.getDamage()<50;
            }
        };

        System.out.println("使用匿名类过滤");
        filter(heros, c);
        System.out.println("使用Lambda表达式");
        filter(heros, h->h.getHp()>100 && h.getDamage()<50);
        System.out.println("在Lambda表达式中使用静态方法");
        filter(heros, h -> QuoteStatic.testHero(h) );
        System.out.println("直接引用静态方法");
        filter(heros, QuoteStatic::testHero);
    }

    public static boolean testHero(Hero h) {
        return h.getHp()>100 && h.getDamage()<50;
    }

    private static void filter(List<Hero> heros, HeroChecker checker) {
        for (Hero hero : heros) {
            if (checker.test(hero))
                System.out.print(hero);
        }
    }

}
