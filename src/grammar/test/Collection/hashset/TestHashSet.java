package grammar.test.Collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * �޾���ʵ�֣�������HashMap��key
 * �����ظ�������
 *
 */
public class TestHashSet {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();
        names.add("gareen");
        System.out.println(names);
        //�ڶ��β���ͬ�������ݣ��ǲ岻��ȥ�ģ�������ֻ�ᱣ��һ��
        names.add("gareen");
        System.out.println(names);

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        // Set�е�Ԫ�����У����ǰ��ղ���˳��
        System.out.println(numbers);

        HashSet<Integer> numbers2 = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            numbers2.add(i);
        }

        //Set���ṩget��������ȡָ��λ�õ�Ԫ��
        //numbers.get(0)

        //����Set���Բ��õ�����iterator
        for (Iterator<Integer> iterator = numbers2.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }

        //���߲�����ǿ��forѭ��
        for (Integer i : numbers2) {
            System.out.println(i);
        }

    }
}
