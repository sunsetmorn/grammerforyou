package grammar.Collection.hashmap;

import grammar.test.hero.herotemplate.Hero;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class PracticeHashMap {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();
        for(int i=0;i <3000000; i++){
            Random a =new Random();
            Hero ah =new Hero("hreo-"+a.nextInt(3000000),a.nextInt(3000000));
            heroes.add(ah);
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("开始时间是："+formatter.format(new Date()));
        for(int i=0;i<heroes.size();i++){
            System.out.print(i);
            if(heroes.get(i).getName().equals("hero-5555")){
                System.out.println(heroes.get(i));
            }
        }
        System.out.println(" ");
        System.out.println("结束时间是："+formatter.format(new Date()));
    }
}
