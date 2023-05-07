package com.ralap._0120;

import com.ralap.comm.TreeNode;
import com.sun.source.tree.Tree;

import java.util.Arrays;

/**
 * 108. 将有序数组转换为二叉搜索树
 * <p>
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [-10,-3,0,5,9]
 * 输出：[0,-3,9,-10,null,5]
 * 解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [1,3]
 * 输出：[3,1]
 * 解释：[1,null,3] 和 [3,1] 都是高度平衡二叉搜索树。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 按 严格递增 顺序排列
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 */
class _108_ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int rootIndex = nums.length >> 1;
        TreeNode root = new TreeNode(nums[rootIndex]);
        if (nums.length == 1) {
            return root;
        }

        if(rootIndex > 0){
            int[] left = Arrays.copyOfRange(nums, 0, rootIndex);
            root.left = sortedArrayToBST(left);
        }

        if(rootIndex < nums.length){
            int[] right = Arrays.copyOfRange(nums, rootIndex + 1, nums.length);
            root.right = sortedArrayToBST(right);
        }
        return root;
    }
}

