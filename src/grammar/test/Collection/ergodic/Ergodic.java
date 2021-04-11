package grammar.test.Collection.ergodic;

import grammar.material.hero.herotemplate.Hero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ����
 */
public class Ergodic {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();

        // ��5��Hero��������
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }

        // ��һ�ֱ��� forѭ��
        System.out.println("--------for ѭ��-------");
        for (int i = 0; i < heros.size(); i++) {
            Hero h = heros.get(i);
            System.out.println(h);
        }

        //�ڶ��ֱ�����ʹ�õ�����
        System.out.println("--------ʹ��while��iterator-------");
        Iterator<Hero> it= heros.iterator();
        //���ʼ��λ���ж�"��һ��"λ���Ƿ�������
        //����о�ͨ��nextȡ���������Ұ�ָ�������ƶ�
        //ֱ��"��һ��"λ��û������
        while(it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        //��������forд��
        System.out.println("--------ʹ��for��iterator-------");
        for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }

        // �����֣���ǿ��forѭ��
        System.out.println("--------��ǿ��forѭ��-------");
        for (Hero h : heros) {
            System.out.println(h);
        }
    }

}
