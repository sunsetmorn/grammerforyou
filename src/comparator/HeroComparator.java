package comparator;

import grammar.material.hero.herotemplate.Hero;

import java.util.*;

public class HeroComparator {
    public static void main(String[] args) {
        Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();

        for (int i = 0; i < 10; i++) {
            //ͨ�����ֵʵ����hero��hp��damage
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        Comparator<Hero> h1 =new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                if(o1.getHp() > o2.getHp())
                    return 1;
                else
                    return -1;
            }
        };
        /**
         * lambda���ʽ�ļ򻯲���
         */
        Comparator<Hero> h2=(Hero o1, Hero o2) -> {
            if(o1.getHp() > o2.getHp())
                return 1;
            else
                return -1;
        };
        Comparator<Hero> h3=(Hero o1, Hero o2) -> (o1.getHp() > o2.getHp())?1:-1;
        Comparator<Hero> h4=(o1,o2) -> (o1.getHp() > o2.getHp())?1:-1;

        Collections.sort(heros,h1);
        Collections.sort(heros,h2);

        Collections.sort(heros,(o1,o2) -> (o1.getHp() > o2.getHp())?1:-1);
        /*���þ�̬����*/
        Collections.sort(heros,(o1,o2)->HeroComparator.compare(o1,o2));
        Collections.sort(heros,HeroComparator::compare);
        /*���������еķ���*/
        Collections.sort(heros,(o1,o2)->compare(o1,o2));
        Collections.sort(heros,Hero::compare);

        System.out.println("����Ѫ�������ļ��ϣ�");
        System.out.println(heros);

    }

    public static int compare(Hero o1, Hero o2){
        return o1.getHp()>o2.getHp()?1:-1;
    }
}
