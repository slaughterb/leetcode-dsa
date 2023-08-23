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
    // we can define a record to hold data to pass between objects
    record Pair(TreeNode node, Integer val) {}

    public int minDepth(TreeNode root) {
        // if null tree has no depth
        if (root == null) {
            return 0;
        }
        // run a queue through BFS of tree, O(n):
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 1));

        while (!q.isEmpty()) {
            Pair pr = q.poll();
            TreeNode left = pr.node.left;
            TreeNode right = pr.node.right;
            Integer depth = pr.val;
            if (left == null && right == null) {
                return depth;
            }
            if (left != null) {
                q.add(new Pair(left, depth + 1));
            }
            if (right != null) {
                q.add(new Pair(right, depth + 1));
            }
        }
        return -1;
    }
}