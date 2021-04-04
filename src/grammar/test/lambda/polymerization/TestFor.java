package grammar.test.lambda.polymerization;

import grammar.material.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class TestFor {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("查询条件：hp>100 && damage<50");
        System.out.println("通过传统操作方式找出满足条件的数据：");

        for (Hero h : heros) {
            if (h.getHp() > 100 && h.getDamage() < 50)
                System.out.println(h.getName());
        }

        /**
         * 使用聚合方式遍历数据
         */
        System.out.println("通过聚合操作方式找出满足条件的数据：");
        heros
                .stream()
                .filter(h -> h.getHp() > 100 && h.getDamage() < 50)
                .forEach(h -> System.out.println(h.getName() ));


        /**
         * 要了解聚合操作，首先要建立Stream和管道的概念
         * Stream 和Collection结构化的数据不一样，Stream是一系列的元素，就像是生产线上的罐头一样，一串串的出来。
         * 管道指的是一系列的聚合操作。
         *
         * 管道又分3个部分
         * 管道源：在这个例子里，源是一个List
         * 中间操作：每个中间操作，又会返回一个Stream，比如.filter()又返回一个Stream, 中间操作是“懒”操作，
         *          并不会真正进行遍历。
         * 结束操作：当这个操作执行后，流就被使用“光”了，无法再被操作。所以这必定是流的最后一个操作。
         *          结束操作不会返回Stream，但是会返回int、float、String、 Collection或者像forEach，什么都不返回,
         *          结束操作才进行真正的遍历行为，在遍历的时候，才会去进行中间操作的相关判断
         *
         */

        //管道源是集合
        System.out.println("管道源是集合：");
        heros
            .stream()
            .forEach(h->System.out.println(h.getName()));
        //管道源是数组
        System.out.println("管道源是数组：");
        Hero hs[] = heros.toArray(new Hero[heros.size()]);
        Arrays.stream(hs)
              .forEach(h->System.out.println(h.getName()));

        /**
         * 每个中间操作，又会返回一个Stream，比如.filter()又返回一个Stream, 中间操作是“懒”操作，并不会真正进行遍历。
         * 中间操作比较多，主要分两类
         * 对元素进行筛选 和 转换为其他形式的流
         * 对元素进行筛选：
         *      filter 匹配
         *      distinct 去除重复(根据equals判断)
         *      sorted 自然排序
         *      sorted(Comparator<T>) 指定排序
         *      limit 保留
         *      skip 忽略
         * 转换为其他形式的流
         *      mapToDouble 转换为double的流
         *      map 转换为任意类型的流
         */

        //制造一个重复数据
        heros.add(heros.get(0));
        System.out.println("初始化集合后的数据 (最后一个数据重复)：");
        System.out.println(heros);
        System.out.println("满足条件hp>100&&damage<50的数据");
        heros
            .stream()
            .filter(h->h.getHp()>100&&h.getDamage()<50)
            .forEach(h->System.out.print(h));

        System.out.println("去除重复的数据，去除标准是看equals");
        heros
            .stream()
            .distinct()
            .forEach(h->System.out.print(h));

        System.out.println("按照血量排序");
        heros
            .stream()
            .sorted((h1,h2)->h1.getHp()>=h2.getHp()?1:-1)
            .forEach(h->System.out.print(h));

        System.out.println("保留3个");
        heros
            .stream()
            .limit(3)
            .forEach(h->System.out.print(h));

        System.out.println("忽略前3个");
        heros
            .stream()
            .skip(3)
            .forEach(h->System.out.print(h));

        System.out.println("转换为double的Stream");
        heros
            .stream()
            .mapToDouble(Hero::getHp)
            .forEach(h->System.out.println(h));

        System.out.println("转换任意类型的Stream");
        heros
            .stream()
            .map((h)-> h.getName() + " - " + h.getHp() + " - " + h.getDamage())
            .forEach(h->System.out.println(h));


        /**
         * 当进行结束操作后，流就被使用“光”了，无法再被操作。所以这必定是流的最后一个操作。 结束操作不会返回Stream，但是会返回int、float、String、 Collection或者像forEach，什么都不返回,。
         * 结束操作才真正进行遍历行为，前面的中间操作也在这个时候，才真正的执行。
         * 常见结束操作如下：
         *      forEach() 遍历每个元素
         *      toArray() 转换为数组
         *      min(Comparator<T>) 取最小的元素
         *      max(Comparator<T>) 取最大的元素
         *      count() 总数
         *      findFirst() 第一个元素
         */
        System.out.println("遍历集合中的每个数据");
        heros
            .stream()
            .forEach(h->System.out.print(h));
        System.out.println("返回一个数组");
        Object[] hs2= heros
            .stream()
            .toArray();
        System.out.println(Arrays.toString(hs2));
        System.out.println("返回伤害最低的那个英雄");
        Hero minDamageHero =
            heros
                .stream()
                .min((h1,h2)->h1.getDamage()-h2.getDamage())
                .get();
        System.out.print(minDamageHero);
        System.out.println("返回伤害最高的那个英雄");

        Hero mxnDamageHero =
            heros
                .stream()
                .max((h1,h2)->h1.getDamage()-h2.getDamage())
                .get();
        System.out.print(mxnDamageHero);

        System.out.println("流中数据的总数");
        long count = heros
            .stream()
            .count();
        System.out.println(count);

        System.out.println("第一个英雄");
        Hero firstHero =
            heros
                .stream()
                .findFirst()
                .get();

        System.out.println(firstHero);
    }
}
