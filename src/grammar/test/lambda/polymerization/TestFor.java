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

        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        System.out.println("��ѯ������hp>100 && damage<50");
        System.out.println("ͨ����ͳ������ʽ�ҳ��������������ݣ�");

        for (Hero h : heros) {
            if (h.getHp() > 100 && h.getDamage() < 50)
                System.out.println(h.getName());
        }

        /**
         * ʹ�þۺϷ�ʽ��������
         */
        System.out.println("ͨ���ۺϲ�����ʽ�ҳ��������������ݣ�");
        heros
                .stream()
                .filter(h -> h.getHp() > 100 && h.getDamage() < 50)
                .forEach(h -> System.out.println(h.getName() ));


        /**
         * Ҫ�˽�ۺϲ���������Ҫ����Stream�͹ܵ��ĸ���
         * Stream ��Collection�ṹ�������ݲ�һ����Stream��һϵ�е�Ԫ�أ��������������ϵĹ�ͷһ����һ�����ĳ�����
         * �ܵ�ָ����һϵ�еľۺϲ�����
         *
         * �ܵ��ַ�3������
         * �ܵ�Դ������������Դ��һ��List
         * �м������ÿ���м�������ֻ᷵��һ��Stream������.filter()�ַ���һ��Stream, �м�����ǡ�����������
         *          �������������б�����
         * �������������������ִ�к����ͱ�ʹ�á��⡱�ˣ��޷��ٱ�������������ض����������һ��������
         *          �����������᷵��Stream�����ǻ᷵��int��float��String�� Collection������forEach��ʲô��������,
         *          ���������Ž��������ı�����Ϊ���ڱ�����ʱ�򣬲Ż�ȥ�����м����������ж�
         *
         */

        //�ܵ�Դ�Ǽ���
        System.out.println("�ܵ�Դ�Ǽ��ϣ�");
        heros
            .stream()
            .forEach(h->System.out.println(h.getName()));
        //�ܵ�Դ������
        System.out.println("�ܵ�Դ�����飺");
        Hero hs[] = heros.toArray(new Hero[heros.size()]);
        Arrays.stream(hs)
              .forEach(h->System.out.println(h.getName()));

        /**
         * ÿ���м�������ֻ᷵��һ��Stream������.filter()�ַ���һ��Stream, �м�����ǡ������������������������б�����
         * �м�����Ƚ϶࣬��Ҫ������
         * ��Ԫ�ؽ���ɸѡ �� ת��Ϊ������ʽ����
         * ��Ԫ�ؽ���ɸѡ��
         *      filter ƥ��
         *      distinct ȥ���ظ�(����equals�ж�)
         *      sorted ��Ȼ����
         *      sorted(Comparator<T>) ָ������
         *      limit ����
         *      skip ����
         * ת��Ϊ������ʽ����
         *      mapToDouble ת��Ϊdouble����
         *      map ת��Ϊ�������͵���
         */

        //����һ���ظ�����
        heros.add(heros.get(0));
        System.out.println("��ʼ�����Ϻ������ (���һ�������ظ�)��");
        System.out.println(heros);
        System.out.println("��������hp>100&&damage<50������");
        heros
            .stream()
            .filter(h->h.getHp()>100&&h.getDamage()<50)
            .forEach(h->System.out.print(h));

        System.out.println("ȥ���ظ������ݣ�ȥ����׼�ǿ�equals");
        heros
            .stream()
            .distinct()
            .forEach(h->System.out.print(h));

        System.out.println("����Ѫ������");
        heros
            .stream()
            .sorted((h1,h2)->h1.getHp()>=h2.getHp()?1:-1)
            .forEach(h->System.out.print(h));

        System.out.println("����3��");
        heros
            .stream()
            .limit(3)
            .forEach(h->System.out.print(h));

        System.out.println("����ǰ3��");
        heros
            .stream()
            .skip(3)
            .forEach(h->System.out.print(h));

        System.out.println("ת��Ϊdouble��Stream");
        heros
            .stream()
            .mapToDouble(Hero::getHp)
            .forEach(h->System.out.println(h));

        System.out.println("ת���������͵�Stream");
        heros
            .stream()
            .map((h)-> h.getName() + " - " + h.getHp() + " - " + h.getDamage())
            .forEach(h->System.out.println(h));


        /**
         * �����н������������ͱ�ʹ�á��⡱�ˣ��޷��ٱ�������������ض����������һ�������� �����������᷵��Stream�����ǻ᷵��int��float��String�� Collection������forEach��ʲô��������,��
         * �����������������б�����Ϊ��ǰ����м����Ҳ�����ʱ�򣬲�������ִ�С�
         * ���������������£�
         *      forEach() ����ÿ��Ԫ��
         *      toArray() ת��Ϊ����
         *      min(Comparator<T>) ȡ��С��Ԫ��
         *      max(Comparator<T>) ȡ����Ԫ��
         *      count() ����
         *      findFirst() ��һ��Ԫ��
         */
        System.out.println("���������е�ÿ������");
        heros
            .stream()
            .forEach(h->System.out.print(h));
        System.out.println("����һ������");
        Object[] hs2= heros
            .stream()
            .toArray();
        System.out.println(Arrays.toString(hs2));
        System.out.println("�����˺���͵��Ǹ�Ӣ��");
        Hero minDamageHero =
            heros
                .stream()
                .min((h1,h2)->h1.getDamage()-h2.getDamage())
                .get();
        System.out.print(minDamageHero);
        System.out.println("�����˺���ߵ��Ǹ�Ӣ��");

        Hero mxnDamageHero =
            heros
                .stream()
                .max((h1,h2)->h1.getDamage()-h2.getDamage())
                .get();
        System.out.print(mxnDamageHero);

        System.out.println("�������ݵ�����");
        long count = heros
            .stream()
            .count();
        System.out.println(count);

        System.out.println("��һ��Ӣ��");
        Hero firstHero =
            heros
                .stream()
                .findFirst()
                .get();

        System.out.println(firstHero);
    }
}
