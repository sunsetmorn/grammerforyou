package grammar.test.thread.method;

import grammar.material.hero.herotemplate.Hero;
import grammar.material.hero.herowarehouse.IduHero;

public class PracticeSkillAdugen {
    public static void main(String[] args) {
        IduHero gareen = new IduHero("¸ÇÂ×",616,50);
        Hero teemo = new Hero("ÌáÄª",3000,30);
        Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.skillAdugen(teemo);
                }
            }
        };
        t1.start();
    }
}
