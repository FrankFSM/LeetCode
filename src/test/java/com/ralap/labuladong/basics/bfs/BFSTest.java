package com.ralap.labuladong.basics.bfs;

import com.ralap.comm.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class BFSTest {
    private TreeNode root;
    private BFS bfs;

    @Before
    public void setUp(){
        root = new TreeNode(5);
        root.left = new TreeNode(7);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(1);
        bfs = new BFS();

    }

    @Test
    public void minDepth() {
        System.out.println(bfs.minDepth(root));
    }

    @Test
    public void openLock() {
        System.out.println(bfs.openLock("0030", new String[]{"0020"}));
    }
}