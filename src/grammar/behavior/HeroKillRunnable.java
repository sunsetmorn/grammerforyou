package grammar.behavior;

import grammar.material.hero.herotemplate.Hero;

/**
 * ʵ��runnable�ķ�ʽʵ�ֶ��̣߳�����runnable��û��start()������
 * ������Ҫ�½�һ��Thread����ʹ��start()����
 */
public class HeroKillRunnable implements Runnable{
    private Hero h1;
    private Hero h2 ;

    public HeroKillRunnable(Hero h1,Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while (!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
