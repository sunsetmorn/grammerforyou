package grammar.test.Collection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestCollection {
    public static void main(String[] args) {
        //��ʼ������numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("�����е�����:");
        System.out.println(numbers);
        /**
         * ��ת
         */
        Collections.reverse(numbers);
        System.out.println("��ת�󼯺��е�����:");
        System.out.println(numbers);
        /**
         * ����
         */
        Collections.shuffle(numbers);
        System.out.println("�����󼯺��е�����:");
        System.out.println(numbers);
        /**
         * ����
         */
        Collections.sort(numbers);
        System.out.println("����󼯺��е�����:");
        System.out.println(numbers);
        /**
         * ����
         */
        Collections.swap(numbers,0,5);
        System.out.println("����0��5�±�����ݺ󣬼����е�����:");
        System.out.println(numbers);
        /**
         * ����
         */
        Collections.rotate(numbers,2);
        System.out.println("�Ѽ������ҹ���2����λ��������ݺ󣬼����е�����:");
        System.out.println(numbers);
        /**
         * �̰߳�ȫ��
         */
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
        System.out.println("�̰߳�ȫ��֮���������:");
        System.out.println(synchronizedNumbers);
    }
}
