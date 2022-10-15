package com.ralap.tree;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class SearchTreeTest extends TestCase {

    public void testInsert() {
        SearchTree st = new SearchTree();
        st.insert(6);
        st.insert(4);
        st.insert(9);
        st.insert(3);
        st.insert(5);
        st.insert(7);
        st.insert(11);
        st.insert(2);
        TreeNode root  = st.getRoot();
        TreeNode.midTraversal(root);
    }

    public void testDelete() {
        SearchTree st = new SearchTree();
        st.insert(6);
        st.insert(4);
        st.insert(9);
        st.insert(3);
        st.insert(5);
        st.insert(7);
        st.insert(11);
        st.insert(2);
        TreeNode root  = st.getRoot();
        TreeNode.midTraversal(root);

        System.out.println("====================");
        st.delete(root, 9);
        TreeNode.midTraversal(root);

    }
}