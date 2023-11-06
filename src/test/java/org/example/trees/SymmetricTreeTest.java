package org.example.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {
    @Test
    public void test1() {
        TreeNode treeNode =
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3, null ,null),
                                new TreeNode(4, null, null)),
                        new TreeNode(2,
                                new TreeNode(4, null, null),
                                new TreeNode(3, null ,null)));
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(treeNode);
        assertTrue(symmetric);
    }

    @Test
    public void test2() {
        TreeNode treeNode =
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3, null ,null),
                                new TreeNode(4, null, null)),
                        new TreeNode(5,
                                new TreeNode(4, null, null),
                                new TreeNode(3, null ,null)));
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(treeNode);
        assertFalse(symmetric);
    }

    @Test
    public void test3() {
        TreeNode treeNode =
                new TreeNode(1, null, null);
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(treeNode);
        assertTrue(symmetric);
    }

    @Test
    public void test4() {
        TreeNode treeNode =
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(2, null, null),
                                null),
                        new TreeNode(2,
                                new TreeNode(2, null, null),
                                null));
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(treeNode);
        assertFalse(symmetric);
    }

    @Test
    public void test5() {
        TreeNode treeNode =
                new TreeNode(1,
                        new TreeNode(2, null, null), null);
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(treeNode);
        assertFalse(symmetric);
    }

    @Test
    public void test6() {
        TreeNode treeNode =
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3, null, null),
                                null),
                        new TreeNode(2,
                                null,
                                new TreeNode(3, null, null)));
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(treeNode);
        assertTrue(symmetric);
    }

    @Test
    public void test7() {
        TreeNode treeNode =
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4, null, null),
                                new TreeNode(5, null, null)),
                        new TreeNode(3,
                                new TreeNode(5, null, null),
                                null));
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(treeNode);
        assertFalse(symmetric);
    }

    @Test
    public void test8() {
        TreeNode treeNode =
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(4, null, null),
                                new TreeNode(5, null, null)),
                        new TreeNode(3,
                                new TreeNode(5, null, null),
                                null));
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(treeNode);
        assertFalse(symmetric);
    }


}