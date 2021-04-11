package grammar.test.thread.modeforimplemetation;

import grammar.material.hero.herotemplate.Hero;

public class TestOneThread {
    public static void main(String[] args) {

        Hero gareen = new Hero("盖伦",616,50);
        Hero teemo = new Hero("提莫",300,30);
        Hero bh = new Hero("赏金猎人",500,65);
        Hero leesin = new Hero("盲僧",455,80);

        /**单线程情况下的情况*/
        //盖伦攻击提莫
        while(!teemo.isDead()){
            gareen.attackHero(teemo);
        }
        //赏金猎人攻击盲僧
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }
    }
}
