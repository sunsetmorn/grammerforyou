package grammar.test.Collection.ergodic;

import grammar.material.hero.herotemplate.Hero;

import java.util.ArrayList;
import java.util.List;

public class ErgodicPractice {
    /**
     * ���ȳ�ʼ��һ��Hero���ϣ������100��Hero�������Ʒֱ��Ǵ�
     * hero 0
     * hero 1
     * hero 2
     * ...
     * hero 99.
     * ͨ���������ֶΣ�ɾ�������ֱ����8�ı����Ķ���
     */
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();
        for(int i=0; i<100;i++){
            heroes.add(new Hero("hero "+ i));
        }
        for(int i=99; i>=0;i--){
            if(i%8 == 0){
                heroes.remove(i);
            }
        }
        for (Hero h:heroes) {
            System.out.println(h);
        }
    }
}
