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
    public int sumNumbers(TreeNode root) {
        return sumNum(root, 0);
    }

    public int sumNum(TreeNode root, int num){
        if(root == null)    return 0;

        num = num * 10 + root.val;

        if(root.left == null && root.right == null){
            return num;
        }

        return sumNum(root.left, num) + sumNum(root.right, num);
    }
}