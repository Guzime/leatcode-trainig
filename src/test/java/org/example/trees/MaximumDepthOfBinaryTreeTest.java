package org.example.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test1() {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null ,null)));

        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        assertEquals(3, maximumDepthOfBinaryTree.maxDepth(treeNode));
    }

    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(3,
                                    new TreeNode(9,
                                            new TreeNode(1, null, null),
                                            new TreeNode(11,
                                                    new TreeNode(-10, null, null),
                                                    new TreeNode(-5, null ,null))),
                                    new TreeNode(20,
                                            new TreeNode(15, null, null),
                                            new TreeNode(7, null ,null)));

        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        assertEquals(4, maximumDepthOfBinaryTree.maxDepth(treeNode));
    }

    @Test
    public void test3() {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9,
                        new TreeNode(20,
                                new TreeNode(22, null, null), null), null),
               null);

        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        assertEquals(4, maximumDepthOfBinaryTree.maxDepth(treeNode));
    }

}