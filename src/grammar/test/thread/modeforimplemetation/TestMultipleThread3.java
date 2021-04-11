package grammar.test.thread.modeforimplemetation;

import grammar.material.hero.herotemplate.Hero;

/**
 * 使用匿名类的实现多线程
 */
public class TestMultipleThread3 {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦",616,50);
        Hero teemo = new Hero("提莫",300,30);
        Hero bh = new Hero("赏金猎人",500,65);
        Hero leesin = new Hero("盲僧",455,80);

        Thread t1 = new Thread(){
            public void run(){
                //匿名类中用到外部的局部变量teemo，必须把teemo声明为final
                //但是在JDK7以后，就不是必须加final的了
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                //匿名类中用到外部的局部变量teemo，必须把teemo声明为final
                //但是在JDK7以后，就不是必须加final的了
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };
        t2.start();
    }
}
