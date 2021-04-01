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
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == value)
            value = v;
            // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同
            if ( v.getHealthValue() -value.getHealthValue() <= 0) {
                if (null == leftHero) leftHero = new HeroNode();
                leftHero.add(v);
            }else {// 新增的值，比当前值大
                if (null == rightHero) rightHero = new HeroNode();
                rightHero.add(v);
            }
        }
    }

    @Override
    public List<Hero> values() {
        List<Hero> v = new ArrayList<>();
        // 左节点的遍历结果
        if (null != leftHero) v.addAll(leftHero.values());
        // 当前节点
        v.add(value);
        // 右节点的遍历结果
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
