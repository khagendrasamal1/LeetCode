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
        int n = nums.length;
        
        if(n == 0)  return null;

        return getBST(nums, 0, n-1);
    }

    static TreeNode getBST(int nums[], int startInd, int endInd){
        if(startInd > endInd)   return null;

        int mid = startInd + (endInd - startInd) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = getBST(nums, startInd, mid-1);
        root.right = getBST(nums, mid+1, endInd);

        return root;
    }
}