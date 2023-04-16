package grammar.lambda.knowlambda;

import grammar.test.hero.herotemplate.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * lambda���ʽ
 * �ŵ㣺
 * 1.ʹ�����໯
 *
 * �׶�:
 * Lambda���ʽ��Ȼ�����˴���ļ�࣬����Ҳ��������ԡ�
 * 1. �ɶ��Բ�놪�µĵ������������������ṹ�Ƚ�������Lambda���ʽһ����ñȽϳ������������
 * 2. �����ڵ��ԣ�������Lambda���ʽ�����ӵ�����Ϣ��������־
 * 3. �汾֧�֣�Lambda���ʽ��JDK8�汾�вſ�ʼ֧�֣����ϵͳʹ�õ�����ǰ�İ汾������ϵͳ���ȶ��Ե�ԭ�򣬶���Ը����������ô���޷�ʹ�á�
 *
 * ���ó�����
 * Lambda�Ƚ��ʺ����ڼ�̵�ҵ������У������ʺ����ڸ��ӵ�ϵͳ�У���Ӵ�ά���ɱ���
 */
public class Testlambda {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        System.out.println("ʹ��Lamdba�ķ�ʽ��ɸѡ�� hp>100 && damange<50��Ӣ��");
        filter(heros,h->h.getHp()>100 && h.getDamage()<50);
    }

    private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }
}
