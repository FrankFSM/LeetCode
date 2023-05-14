package com.ralap._0120;

import com.ralap.comm.Node;
import junit.framework.TestCase;

public class _116_PopulatingNextRightPointersInEachNodeTest extends TestCase {

    public void testConnect() {
        _116_PopulatingNextRightPointersInEachNode solution = new _116_PopulatingNextRightPointersInEachNode();
        Node root = new Node(1);
        Node root1 = new Node(2);
        Node root2 = new Node(3);
        Node root3 = new Node(4);
        Node root4 = new Node(5);
        Node root5 = new Node(6);
        Node root6 = new Node(7);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = root5;
        root2.right = root6;
        solution.connect(root);
        System.out.println(root);
    }
}