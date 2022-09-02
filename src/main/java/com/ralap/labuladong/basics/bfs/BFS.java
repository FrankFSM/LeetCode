package com.ralap.labuladong.basics.bfs;

import com.ralap.comm.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {

    /**
     * 二叉树最小高度
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            // 当前层的节点个数
            int currSize = queue.size();
            // 遍历这一层的所有节点
            for (int i = 0; i < currSize; i++) {
                TreeNode curr = queue.poll();
                // 是否到达叶子节点
                if (curr.left == null && curr.right == null) {
                    return depth;
                }
                // 存在叶子节点，入队
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            depth++;
        }
        return depth;
    }


    /**
     * 开锁
     */
    public int openLock(String target, String[] deadEnds) {
        String start = "0000";
        int step = 0;
        // 处理dead
        Set<String> deadSet = new HashSet<>();
        for (String deadEnd : deadEnds) {
            deadSet.add(deadEnd);
        }
        // 是否已经穷举过
        Set<String> visited = new HashSet<>();
        visited.add(start);
        Queue<String> queue = new LinkedList();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            // 这一层的所有可能
            for (int i = 0; i < size; i++) {
                // 逐个出队
                String curr = queue.poll();
                // 合法性
                if (deadSet.contains(curr)) {
                    continue;
                }
                // 是否已经满足
                if (curr.equals(target)) {
                    return step;
                }
                // 每个位置的情况
                for (int j = 0; j < start.length(); j++) {
                    // 向上旋转
                    String up = this.plusOne(curr, j);
                    if (!visited.contains(up)) {
                        queue.offer(up);
                        visited.add(up);
                    }
                    // 向下旋转
                    String down = this.minusOne(curr, j);
                    if (!visited.contains(down)) {
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    /**
     * 向上
     */
    private String plusOne(String s, int j) {
        char[] chars = s.toCharArray();
        if (chars[j] == '9') {
            chars[j] = '0';
        } else {
            chars[j] += 1;
        }
        return new String(chars);
    }


    /**
     * 向下
     */
    private String minusOne(String s, int j) {
        char[] chars = s.toCharArray();
        if (chars[j] == '0') {
            chars[j] = '9';
        } else {
            chars[j] -= 1;
        }
        return new String(chars);
    }
}
