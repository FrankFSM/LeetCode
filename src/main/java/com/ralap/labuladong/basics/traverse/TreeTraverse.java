package com.ralap.labuladong.basics.traverse;

import com.ralap.comm.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 树的相关遍历
 */
public class TreeTraverse {
    private TreeNode root;

    public TreeTraverse(TreeNode root) {
        this.root = root;
    }

    // 广度优先
    public void bfs(){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if (currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
            }
            System.out.println(currNode.val);
        }
    }

    // 深度优先
    public void dfs(){
        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            System.out.println(currNode.val);
            // 先右后左
            if(currNode.right != null)
                stack.push(currNode.right);
            if(currNode.left != null)
                stack.push(currNode.left);
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder() {
        this.doPostOrder(root);
    }

    private void doPostOrder(TreeNode node) {
        if (node == null)
            return;
        this.doPostOrder(node.left);
        this.doPostOrder(node.right);
        System.out.println(node.val);
    }

    /**
     * 中序遍历
     */
    public void inOrder() {
        this.doInorder(this.root);
    }

    private void doInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        this.doInorder(node.left);
        System.out.println(node.val);
        this.doInorder(node.right);
    }

    /**
     * 先序遍历
     */
    public void preOrder() {
        this.doPreOrder(root);
    }

    /**
     * 先序遍历
     */
    private void doPreOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.println(node.val);
        doPreOrder(node.left);
        doPreOrder(node.right);
    }
}
