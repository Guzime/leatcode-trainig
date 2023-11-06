package org.example.trees;

import java.util.Stack;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null || rightNode == null) {
            return leftNode ==  rightNode;
        }
        System.out.println(leftNode.val + " - " + rightNode.val);
        return leftNode.val == rightNode.val
                && isMirror(leftNode.left, rightNode.right)
                && isMirror(leftNode.right, rightNode.left);
    }

    // Не добил решение
    public boolean isSymmetric2(TreeNode root) {
        if (root.left != null && root.right == null || root.left == null && root.right != null) {
            return false;
        }
        Stack<Integer> stackVal = new Stack<>();
        boolean result = symmetricOrder(root, root, stackVal, false);
        //System.out.println("stack size - " + stackVal.size());
        return result;
    }

    public boolean symmetricOrder(TreeNode start, TreeNode root, Stack<Integer> stackVal, boolean isAsterHalf) {
        if (start == null) {
            return true;
        }
        if (start.left == null && start.right != null) {
            if (isAsterHalf) {
                stackVal.pop();
                if (stackVal.peek() != -1000) {
                    return false;
                }
            } else {
                stackVal.push(-1000);
                //System.out.println("null - " + stackVal + " - " + stackVal.peek());
            }
        }
        boolean left = symmetricOrder(start.left, root, stackVal, isAsterHalf);

        if (isAsterHalf) {
            stackVal.pop();
        } else {
            stackVal.push(start.val);
        }
        if (start.val != stackVal.peek()) {
            //System.out.println("falsea asds");
            return false;
        }
        //System.out.println(start.val + " - " + stackVal + " - " + stackVal.peek());
        if (start == root) {
            isAsterHalf = true;
        }
        if (start.right == null && start.left != null) {
            if (isAsterHalf) {
                stackVal.pop();
                if (stackVal.peek() != -1000) {
                    return false;
                }
            } else {
                stackVal.push(-1000);
                //System.out.println("null - " + stackVal + " - " + stackVal.peek());
            }
        }
        boolean right = symmetricOrder(start.right, root, stackVal, isAsterHalf);
        return  left & right;
    }

    public void symmetricOrder1(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root.left);
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
    }
}
