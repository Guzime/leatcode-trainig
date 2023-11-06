package org.example.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    public void test1() {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null ,null)));

        assertEquals("9,3,15,20,7", treeNode.toString());
    }

    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null ,null)));

        assertEquals("3,9,20,15,7", treeNode.toStringStraight());
    }

    @Test
    public void test3() {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9,
                        new TreeNode(1, null, null),
                        new TreeNode(11,
                                new TreeNode(-10, null, null),
                                new TreeNode(-5, null ,null))),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null ,null)));

        assertEquals("3,9,20,15,7", treeNode.toStringSymmetricReverse());
    }

}