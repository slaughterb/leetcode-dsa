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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    private TreeNode createBST(int[] arr, int l, int r) {
        if (l > r) {
            return null;
        }
        int mp = l + (r-l)/2;
        TreeNode node = new TreeNode(arr[mp]);
        node.left = createBST(arr, l, mp - 1);
        node.right = createBST(arr, mp + 1, r);
        return node;
    }
}