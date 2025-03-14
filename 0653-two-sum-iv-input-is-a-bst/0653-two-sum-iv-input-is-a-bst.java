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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();

        return findSum(root, k, set);
    }

    public boolean findSum(TreeNode root, int k, Set<Integer> set){
        if(root == null)    return false;

        if(findSum(root.left, k, set) == true)  return true;

        if(set.contains(k - root.val)) return true;

        set.add(root.val);

        return findSum(root.right, k, set);
    }
}