// ==========================================================
// 102. Binary Tree Level Order Traversal
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 96%)
// Memory     : 46.7 MB (Beats 80%)
// Link       : https://leetcode.com/problems/binary-tree-level-order-traversal/
// ==========================================================

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        // Empty tree
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            // Number of nodes in the current level
            int size = queue.size();

            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                // Add current node to this level
                currentLevel.add(node.val);

                // Add children for the next level
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            // Store completed level
            result.add(currentLevel);
        }

        return result;
    }
}