// ==========================================================
// 543. Diameter of Binary Tree
// Difficulty : Easy
// Language   : Java
// Solution   : #3
// Runtime    : 0 ms (Beats 100%)
// Memory     : 47.1 MB (Beats 49%)
// Link       : https://leetcode.com/problems/diameter-of-binary-tree/
// ==========================================================

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return diameter;
    }
    private int height(TreeNode node){
        if(node==null) return 0;
        int left=height(node.left);
        int right=height(node.right);

        diameter=Math.max(diameter, left+right);

        return 1+Math.max(left, right);
    }
}