// ==========================================================
// 103. Binary Tree Zigzag Level Order Traversal
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 84%)
// Memory     : 43.9 MB (Beats 25%)
// Link       : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        // Empty tree
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            // Number of nodes in current level
            int size = queue.size();

            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                // Store current node
                currentLevel.add(node.val);

                // Add children for next level
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            // Reverse alternate levels
            if (!leftToRight) {
                Collections.reverse(currentLevel);
            }

            result.add(currentLevel);

            // Change direction for next level
            leftToRight = !leftToRight;
        }

        return result;
    }
}