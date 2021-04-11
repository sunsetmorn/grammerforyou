package grammar.behavior;

import grammar.material.hero.herotemplate.Hero;

/**
 * ���߳�ʵ�ַ�ʽ1���̳� Thread�࣬����Thread����start()������
 *                ���Կ���ֱ��ʹ��start()����һ���߳�
 */
public class HeroKillThread extends Thread{
    private Hero h1;
    private Hero h2;

    public HeroKillThread(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
