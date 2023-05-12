package com.ralap._0120;

import com.ralap.comm.PrintUtils;
import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

import java.util.List;

public class _113_PathSumIiTest extends TestCase {

    public void testPathSum() {
        _113_PathSumIi solution = new _113_PathSumIi();
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(1);
        root.left = node1;
        node1.right = node2;
        node1.left = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.right = node8;
        List<List<Integer>> lists = solution.pathSum(root, 22);
        PrintUtils.printTwoDimensionalListJoin(lists,",");
    }
}