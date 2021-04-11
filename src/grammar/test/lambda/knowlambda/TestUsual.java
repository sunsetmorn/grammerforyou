package grammar.test.lambda.knowlambda;

import grammar.material.hero.herotemplate.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestUsual {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        System.out.println("ɸѡ�� hp>100 && damange<50��Ӣ��");
        filter(heros);
    }

    private static void filter(List<Hero> heros) {
        for (Hero hero : heros) {
            if(hero.getHp()>100 && hero.getDamage()<50)
                System.out.print(hero);
        }
    }
}
