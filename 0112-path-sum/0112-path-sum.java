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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)    return false;

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sum = new Stack<>();

        path.push(root);
        sum.push(root.val);

        while(!path.isEmpty()){
            TreeNode temp = path.pop();
            int val = sum.pop();

            if(temp.left == null && temp.right == null && val == targetSum){
                return true;
            }

            if(temp.left != null){
                path.push(temp.left);
                sum.push(temp.left.val + val);
            }

            if(temp.right != null){
                path.push(temp.right);
                sum.push(temp.right.val + val);
            }
        }
        return false;
    }
}