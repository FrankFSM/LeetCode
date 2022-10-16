package com.ralap.comm;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 树节点
 */
public class TreeNode {
    public int val;        // 值
    public int height;
    public TreeNode left;  // 左子树
    public TreeNode right; // 右子树

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 生成一棵完全二叉树
     * 0 ～ nodeCount-1
     *
     * @param nodeCount 节点个数
     * @return 根节点
     */
    public static TreeNode generator(int nodeCount) {
        if (nodeCount <= 0) {
            return null;
        }
        TreeNode root = new TreeNode(0);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int number = 1;
        while (number < nodeCount) {
            TreeNode node = new TreeNode(number);
            TreeNode curr = queue.peek();
            if (curr.left != null && curr.right != null) {
                queue.poll();
                continue;
            } else if (curr.left != null) {
                curr.right = node;
                queue.add(node);
                number++;
            } else {
                curr.left = node;
                queue.add(node);
                number++;
            }
        }
        return root;
    }

    /**
     * 先序遍历
     */
    public static void preTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + ",");
        preTraversal(root.left);
        preTraversal(root.right);
    }

    /**
     * 中序遍历
     */
    public static void midTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        midTraversal(root.left);
        System.out.print(root.val + ",");
        midTraversal(root.right);
    }

    /**
     * 后续遍历
     */
    public static void postTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postTraversal(root.left);
        postTraversal(root.right);
        System.out.print(root.val + ",");
    }

    /**
     * 计算高度
     */
    public static int heightTree(TreeNode root) {
        if (root != null) {
            return Math.max(heightTree(root.left), heightTree(root.right)) + 1;
        }
        return 0;
    }
}
