package grammar.Collection.hashmap;

import grammar.test.hero.herotemplate.Hero;

import java.util.HashMap;

/**
 * keyֵ�����ظ�������Ḳ��ǰֵ
 * valueֵ�����ظ�
 *
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("adc", "����Ӣ��");
        dictionary.put("apc", "ħ��Ӣ��");
        dictionary.put("t", "̹��");

        System.out.println(dictionary.get("t"));

        HashMap<String,Hero> heroMap = new HashMap<String,Hero>();

        heroMap.put("gareen", new Hero("gareen1"));
        System.out.println(heroMap);

        //keyΪgareen�Ѿ���value�ˣ�����gareen��Ϊkey�������ݣ��ᵼ��ԭӢ�ۣ�������
        //���������µ�Ԫ�ص�Map��
        heroMap.put("gareen", new Hero("gareen2"));
        System.out.println(heroMap);

        //���map
        heroMap.clear();
        Hero gareen = new Hero("gareen");

        //ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
        heroMap.put("hero1", gareen);
        heroMap.put("hero2", gareen);

        System.out.println(heroMap);
    }
}
