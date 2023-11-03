package org.example.trees;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

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
        return depthCounter(root);
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
