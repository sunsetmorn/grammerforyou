package grammar.test.Collection.treenode;

import grammar.test.Collection.UtilInterface.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IntNode implements TreeNode<Integer> {
    // ���ӽڵ�
    private IntNode leftNode;
    // ���ӽڵ�
    private IntNode rightNode;
    // ֵ
    private Integer value;

    // ��������
    @Override
    public void add(Integer v) {
        // �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
        if (null == value)
            value = v;
            // �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
        else {
            // ������ֵ���ȵ�ǰֵС������ͬ
            if (v -value <= 0) {
                if (null == leftNode)
                    leftNode = new IntNode();
                leftNode.add(v);
            }
            // ������ֵ���ȵ�ǰֵ��
            else {
                if (null == rightNode)
                    rightNode = new IntNode();
                rightNode.add(v);
            }
        }
    }

    // ����������еĽڵ�
    @Override
    public List<Integer> values() {
        List<Integer> v = new ArrayList<>();
        // ��ڵ�ı������
        if (null != leftNode) v.addAll(leftNode.values());
        // ��ǰ�ڵ�
        v.add(value);
        // �ҽڵ�ı������
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
