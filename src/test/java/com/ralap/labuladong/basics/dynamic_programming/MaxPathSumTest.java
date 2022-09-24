package com.ralap.labuladong.basics.dynamic_programming;

import com.ralap.comm.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPathSumTest {

    @Test
    public void solution() {
//        TreeNode node1 = new TreeNode(15);
//        TreeNode node2 = new TreeNode(7);
//        TreeNode node3 = new TreeNode(20, node1, node2);
//        TreeNode node4 = new TreeNode(9);
//        TreeNode root = new TreeNode(-10, node4, node3);
        TreeNode root = TreeNode.generator(10);
        MaxPathSum solution = new MaxPathSum();
        System.out.println(solution.maxPathSum(root));

    }
}