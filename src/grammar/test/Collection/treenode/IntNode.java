package grammar.test.Collection.treenode;

import grammar.test.Collection.UtilInterface.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IntNode implements TreeNode<Integer> {
    // 左子节点
    private IntNode leftNode;
    // 右子节点
    private IntNode rightNode;
    // 值
    private Integer value;

    // 插入数据
    @Override
    public void add(Integer v) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == value)
            value = v;
            // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同
            if (v -value <= 0) {
                if (null == leftNode)
                    leftNode = new IntNode();
                leftNode.add(v);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode)
                    rightNode = new IntNode();
                rightNode.add(v);
            }
        }
    }

    // 中序遍历所有的节点
    @Override
    public List<Integer> values() {
        List<Integer> v = new ArrayList<>();
        // 左节点的遍历结果
        if (null != leftNode) v.addAll(leftNode.values());
        // 当前节点
        v.add(value);
        // 右节点的遍历结果
        if (null != rightNode) v.addAll(rightNode.values());
        return v;
    }

     public static void main(String[] args) {
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
        IntNode roots = new IntNode();
        for (int number : randoms) {
            roots.add(number);
        }
        System.out.println(roots.values());
    }

    public IntNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(IntNode leftNode) {
        this.leftNode = leftNode;
    }

    public IntNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(IntNode rightNode) {
        this.rightNode = rightNode;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
