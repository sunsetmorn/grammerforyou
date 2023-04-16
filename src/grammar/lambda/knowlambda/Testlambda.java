package grammar.lambda.knowlambda;

import grammar.test.hero.herotemplate.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * lambda表达式
 * 优点：
 * 1.使代码简洁化
 *
 * 弊端:
 * Lambda表达式虽然带来了代码的简洁，但是也有其局限性。
 * 1. 可读性差，与啰嗦的但是清晰的匿名类代码结构比较起来，Lambda表达式一旦变得比较长，就难以理解
 * 2. 不便于调试，很难在Lambda表达式中增加调试信息，比如日志
 * 3. 版本支持，Lambda表达式在JDK8版本中才开始支持，如果系统使用的是以前的版本，考虑系统的稳定性等原因，而不愿意升级，那么就无法使用。
 *
 * 适用场景：
 * Lambda比较适合用在简短的业务代码中，并不适合用在复杂的系统中，会加大维护成本。
 */
public class Testlambda {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
        filter(heros,h->h.getHp()>100 && h.getDamage()<50);
    }

    private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }
}
