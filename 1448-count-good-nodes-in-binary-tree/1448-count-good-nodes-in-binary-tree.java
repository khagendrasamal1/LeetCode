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
    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }

    public int helper(TreeNode root, int max){
        if(root == null){
            return 0;
        }

        int currMax = 0;
        if(root.val >= max){
            currMax = 1;
            max = root.val;
        }

        int lans = helper(root.left, max);
        int rans = helper(root.right, max);

        return lans + rans + currMax;
    }
}