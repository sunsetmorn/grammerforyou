package grammar.test.Collection;

import grammar.material.APHero;
import grammar.material.Hero;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Hero> a =new ArrayList<>();
        List<APHero> b =new ArrayList<>();
        Hero aa =new Hero();
        APHero bb = new APHero();
        a.set(1,bb);
     }
}
