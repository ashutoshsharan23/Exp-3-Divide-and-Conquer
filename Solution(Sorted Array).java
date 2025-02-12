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
        return buildBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null; // Base case: when no elements are left

        int mid = left + (right - left) / 2; // Find middle element
        TreeNode root = new TreeNode(nums[mid]); // Create root node

        root.left = buildBST(nums, left, mid - 1); // Recursively build left subtree
        root.right = buildBST(nums, mid + 1, right); // Recursively build right subtree

        return root;
    }
}
