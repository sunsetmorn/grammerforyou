package grammar.test.Collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 无具体实现，本质是HashMap的key
 * 不能重复，乱序
 *
 */
public class TestHashSet {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();
        names.add("gareen");
        System.out.println(names);
        //第二次插入同样的数据，是插不进去的，容器中只会保留一个
        names.add("gareen");
        System.out.println(names);

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        // Set中的元素排列，不是按照插入顺序
        System.out.println(numbers);

        HashSet<Integer> numbers2 = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            numbers2.add(i);
        }

        //Set不提供get方法来获取指定位置的元素
        //numbers.get(0)

        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> iterator = numbers2.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }

        //或者采用增强型for循环
        for (Integer i : numbers2) {
            System.out.println(i);
        }

    }
}
