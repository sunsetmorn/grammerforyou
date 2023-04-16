package grammar.test.hero.herowarehouse;

import grammar.test.hero.herotemplate.Hero;

public class IduHero extends Hero {
    private Integer mp = 3;
    private Integer skillDamage = 150;

    public IduHero(){};
    public IduHero(String a,Integer b,Integer c){
        super(a,b,c);
    }

    public void skillAdugen(Hero a){
        System.out.format("%s 还剩 %d点mp\n",super.getName(),this.mp);
        this.mp--;
        a.setHp(a.getHp()-skillDamage);
        System.out.format("%s 使用技能攻击 %s, %s的血变成了 %.0f\n",super.getName(),
                a.getName(),a.getName(),a.getHp());
        try {
            if(mp==0) {
                System.out.format("%s 技能正在充能\n",super.getName());
                Thread.sleep(5000);
                this.mp = 3;
            }
            else {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
