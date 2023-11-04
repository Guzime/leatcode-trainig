package org.example.trees;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along
 * the longest path from the root node down to the farthest leaf node.
 *
 *
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHigh = maxDepth(root.left);
        int rightHigh = maxDepth(root.right);
        return Math.max(leftHigh, rightHigh) + 1;
    }

    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        int counter = 0;
        while (!nodeStack.isEmpty()) {
            if (counter < nodeStack.size()) {
                counter = nodeStack.size();
            }
            TreeNode node = nodeStack.pop();
            System.out.println(node.val);
            if (node.right != null) {
                nodeStack.push(node.right);
            }
            if (node.left != null) {
                nodeStack.push(node.left);
            }
        }
        return counter + 1;
    }

    public int depthCounter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int counter = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek();
            System.out.println(node.val);
            if (counter < queue.size()) {
                counter = queue.size();
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

            queue.remove();
        }
        return counter;
    }

}
