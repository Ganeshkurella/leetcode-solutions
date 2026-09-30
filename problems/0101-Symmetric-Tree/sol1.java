// ==========================================================
// 101. Symmetric Tree
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.8 MB (Beats 16%)
// Link       : https://leetcode.com/problems/symmetric-tree/
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode p, TreeNode q){
            if(p==null && q==null) return true;
            if(p==null || q==null) return false;
            if(p.val!=q.val) return false;
            return isMirror(p.left, q.right) && isMirror(p.right, q.left);
        }
}