package org.example.trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return valid(root, new AtomicLong(Long.MIN_VALUE));
    }

    public boolean valid(TreeNode node, AtomicLong prevValue) {
        if (node == null) {
            return true;
        }
        boolean left = valid(node.left, prevValue);
        if (prevValue.get() >= node.val) {
            return false;
        }
        prevValue.set(node.val);
        boolean right = valid(node.right, prevValue);
        return left & right;
    }

    public boolean valid2(TreeNode node, AtomicInteger prevValue) {
        if (node == null) {
            return true;
        }
        if (node.left != null) {
            valid2(node.left, prevValue);
        }
        if (prevValue.get() > node.val) {
            return false;
        }
        if (node.right != null) {
            valid2(node.right, prevValue);
        }
        return true;
    }


    public boolean isValidBST1(TreeNode root) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            if (node.right != null) {
                nodeStack.push(node.right);
            }
            System.out.println(node.val);
            if (node.left != null) {
                nodeStack.push(node.left);
            }
        }
        return true;
    }
}
