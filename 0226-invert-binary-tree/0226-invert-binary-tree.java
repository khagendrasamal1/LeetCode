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
    public TreeNode invertTree(TreeNode root) {
        solve(root);

        return root;
    }

    static TreeNode solve(TreeNode root){
        if(root == null)    return null;

        TreeNode ml = solve(root.left);
        TreeNode mr = solve(root.right);

        root.left = mr;
        root.right = ml;

        return root;
    }
}