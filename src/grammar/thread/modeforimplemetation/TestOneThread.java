package grammar.thread.modeforimplemetation;

import grammar.test.hero.herotemplate.Hero;

public class TestOneThread {
    public static void main(String[] args) {

        Hero gareen = new Hero("����",616,50);
        Hero teemo = new Hero("��Ī",300,30);
        Hero bh = new Hero("�ͽ�����",500,65);
        Hero leesin = new Hero("äɮ",455,80);

        /**���߳�����µ����*/
        //���׹�����Ī
        while(!teemo.isDead()){
            gareen.attackHero(teemo);
        }
        //�ͽ����˹���äɮ
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }
    }
}
