package org.example.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {
    @Test
    public void test1() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

        TreeNode treeNode =
                new TreeNode(13,
                    new TreeNode(9, null, null),
                    new TreeNode(20,
                            new TreeNode(15, null, null),
                            new TreeNode(27, null ,null)));
        boolean validBST = validateBinarySearchTree.isValidBST(treeNode);
        assertTrue(validBST);
    }

    @Test
    public void test2() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

        TreeNode treeNode =
                new TreeNode(Integer.MIN_VALUE, null ,null);
        boolean validBST = validateBinarySearchTree.isValidBST(treeNode);
        assertTrue(validBST);
    }
}