package org.example.trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        printTreeSymmetric(this, stringBuffer);
        return stringBuffer.toString()
                .substring(0, stringBuffer.length() - 1);
    }

    //Симметричный обход
    private void printTreeSymmetric(TreeNode treeNode, StringBuffer stringBuffer) {
        if (treeNode == null) {
            return;
        }
        printTreeSymmetric(treeNode.left, stringBuffer);
        stringBuffer.append(treeNode.val).append(",");
        printTreeSymmetric(treeNode.right, stringBuffer);
    }

    public String toStringStraight() {
        StringBuffer stringBuffer = new StringBuffer();
        printTreeStraight(this, stringBuffer);
        return stringBuffer.toString()
                .substring(0, stringBuffer.length() - 1);
    }

    public String toStringSymmetricReverse() {
        StringBuffer stringBuffer = new StringBuffer();
        printTreeSymmetricReverse(this, stringBuffer);
        return stringBuffer.toString()
                .substring(0, stringBuffer.length() - 1);
    }

    private void printTreeStraight(TreeNode treeNode, StringBuffer stringBuffer) {
        if (treeNode == null) {
            return;
        }
        stringBuffer.append(treeNode.val).append(",");
        printTreeStraight(treeNode.left, stringBuffer);
        printTreeStraight(treeNode.right, stringBuffer);
    }

    private void printTreeSymmetricReverse(TreeNode treeNode, StringBuffer stringBuffer) {
        if (treeNode == null) {
            return;
        }
        printTreeStraight(treeNode.left, stringBuffer);
        printTreeStraight(treeNode.right, stringBuffer);
        stringBuffer.append(treeNode.val).append(",");
    }
}
