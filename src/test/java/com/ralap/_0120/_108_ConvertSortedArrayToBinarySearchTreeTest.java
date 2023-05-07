package com.ralap._0120;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _108_ConvertSortedArrayToBinarySearchTreeTest extends TestCase {

    public void testSortedArrayToBST() {
        _108_ConvertSortedArrayToBinarySearchTree solution = new _108_ConvertSortedArrayToBinarySearchTree();

        TreeNode root = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(root);

    }
}