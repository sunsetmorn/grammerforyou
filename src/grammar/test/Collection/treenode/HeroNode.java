package grammar.test.Collection.treenode;

import grammar.material.Hero;
import grammar.test.Collection.UtilInterface.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class HeroNode implements TreeNode<Hero> {

    private HeroNode leftHero;
    private HeroNode rightHero;
    private Hero value;

    @Override
    public void add(Hero v) {
        // �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
        if (null == value)
            value = v;
            // �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
        else {
            // ������ֵ���ȵ�ǰֵС������ͬ
            if ( v.getHealthValue() -value.getHealthValue() <= 0) {
                if (null == leftHero) leftHero = new HeroNode();
                leftHero.add(v);
            }else {// ������ֵ���ȵ�ǰֵ��
                if (null == rightHero) rightHero = new HeroNode();
                rightHero.add(v);
            }
        }
    }

    @Override
    public List<Hero> values() {
        List<Hero> v = new ArrayList<>();
        // ��ڵ�ı������
        if (null != leftHero) v.addAll(leftHero.values());
        // ��ǰ�ڵ�
        v.add(value);
        // �ҽڵ�ı������
        if (null != rightHero) v.addAll(rightHero.values());
        return v;
    }

    public static void main(String[] args) {
        HeroNode roots = new HeroNode();
        roots.add(new Hero("hero name "+1,1));
        roots.add(new Hero("hero name "+6,6));
        roots.add(new Hero("hero name "+45454,45454));
        roots.add(new Hero("hero name "+23,23));
        roots.add(new Hero("hero name "+9,9));
        roots.add(new Hero("hero name "+999,999));
        roots.add(new Hero("hero name "+3,3));
        System.out.println(roots.values());
    }
}
