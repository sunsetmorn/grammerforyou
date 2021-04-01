package grammar.test.Collection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestCollection {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);
        /**
         * 反转
         */
        Collections.reverse(numbers);
        System.out.println("翻转后集合中的数据:");
        System.out.println(numbers);
        /**
         * 混淆
         */
        Collections.shuffle(numbers);
        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);
        /**
         * 排序
         */
        Collections.sort(numbers);
        System.out.println("排序后集合中的数据:");
        System.out.println(numbers);
        /**
         * 交换
         */
        Collections.swap(numbers,0,5);
        System.out.println("交换0和5下标的数据后，集合中的数据:");
        System.out.println(numbers);
        /**
         * 滚动
         */
        Collections.rotate(numbers,2);
        System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据:");
        System.out.println(numbers);
        /**
         * 线程安全化
         */
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
        System.out.println("线程安全化之后的数据是:");
        System.out.println(synchronizedNumbers);
    }
}
