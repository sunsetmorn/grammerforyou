package grammar.test.lambda.polymerization;

import grammar.material.Hero;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticePolymerization {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("生成的数据按hp排序是：");
        heros
                .stream()
                .sorted(((o1, o2) -> o1.getHp()>o2.getHp()?-1:1))
                .forEach(h ->System.out.println(h));

        System.out.println("hp排在第三位的是：");
        Hero h = heros
                .stream()
                .sorted(((o1, o2) -> o1.getHp()>o2.getHp()?-1:1))
                .skip(2)
                .findFirst()
                .get();
        System.out.println(h.getName());
    }
}
