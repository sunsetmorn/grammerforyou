package grammar.test.Collection.ergodic;

import grammar.material.hero.herotemplate.Hero;

import java.util.ArrayList;
import java.util.List;

public class ErgodicPractice {
    /**
     * 首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
     * hero 0
     * hero 1
     * hero 2
     * ...
     * hero 99.
     * 通过遍历的手段，删除掉名字编号是8的倍数的对象
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
