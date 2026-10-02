// ==========================================================
// 102. Binary Tree Level Order Traversal
// Difficulty : Medium
// Language   : Java
// Solution   : #3
// Runtime    : 1 ms (Beats 96%)
// Memory     : 46.8 MB (Beats 61%)
// Link       : https://leetcode.com/problems/binary-tree-level-order-traversal/
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
 import java.util.ArrayList;
 import java.util.List;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> arr=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
            TreeNode node=queue.poll();
            arr.add(node.val);

            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
            }
            res.add(arr);
        }
        return res;

    }
}