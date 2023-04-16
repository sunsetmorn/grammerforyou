package grammar.thread.modeforimplemetation;

import grammar.test.hero.herotemplate.Hero;

public class TestOneThread {
    public static void main(String[] args) {

        Hero gareen = new Hero("¸ÇÂ×",616,50);
        Hero teemo = new Hero("ÌáÄª",300,30);
        Hero bh = new Hero("ÉÍ½ðÁÔÈË",500,65);
        Hero leesin = new Hero("Ã¤É®",455,80);

        /**µ¥Ïß³ÌÇé¿öÏÂµÄÇé¿ö*/
        //¸ÇÂ×¹¥»÷ÌáÄª
        while(!teemo.isDead()){
            gareen.attackHero(teemo);
        }
        //ÉÍ½ðÁÔÈË¹¥»÷Ã¤É®
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }
    }
}
