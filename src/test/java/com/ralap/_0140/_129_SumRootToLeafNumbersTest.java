package com.ralap._0140;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _129_SumRootToLeafNumbersTest extends TestCase {

    public void testSumNumbers() {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(0);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        node1.left = node3;
        node1.right = node4;

        _129_SumRootToLeafNumbers solution = new _129_SumRootToLeafNumbers();
        System.out.println(solution.sumNumbers(root));
    }
}