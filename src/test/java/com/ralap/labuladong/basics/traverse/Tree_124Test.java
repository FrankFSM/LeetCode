package com.ralap.labuladong.basics.traverse;

import com.ralap.comm.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tree_124Test {

    private TreeNode root;
    private Tree_124 solution;

    @Before
    public void setUp() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        solution = new Tree_124();

    }

    @Test
    public void maxPathSum() {
        System.out.println(this.solution.maxPathSum(root));
    }
}