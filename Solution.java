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
import java.util.HashMap;

class Solution {
    private HashMap<Integer, Integer> inorderMap;
    private int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderMap = new HashMap<>();
        postIndex = postorder.length - 1;

        // Store inorder indices in HashMap for O(1) lookups
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildTreeHelper(postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] postorder, int left, int right) {
        if (left > right) return null;

        // Get the root value from postorder and decrement the postIndex
        int rootValue = postorder[postIndex--];
        TreeNode root = new TreeNode(rootValue);

        // Get inorder index of the root value
        int inorderIndex = inorderMap.get(rootValue);

        // Build the right subtree first, then the left subtree
        root.right = buildTreeHelper(postorder, inorderIndex + 1, right);
        root.left = buildTreeHelper(postorder, left, inorderIndex - 1);

        return root;
    }
}
