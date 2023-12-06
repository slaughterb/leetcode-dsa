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
    ArrayList<TreeNode> nodeCount = new ArrayList<TreeNode>();

    private int countHelper() {
        return nodeCount.size();
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            nodeCount.add(root);
            countNodes(root.left);
            countNodes(root.right);
        }
        return countHelper();
    }
}