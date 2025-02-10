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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0L, 1);  
        
        return dfs(root, 0L, targetSum, prefixSumMap);
    }

    private int dfs(TreeNode node, long currSum, int targetSum, HashMap<Long, Integer> prefixSumMap) {
        if (node == null) return 0;

        currSum += node.val;
        
        int count = prefixSumMap.getOrDefault(currSum - targetSum, 0);
        
        prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);
        
        count += dfs(node.left, currSum, targetSum, prefixSumMap);
        count += dfs(node.right, currSum, targetSum, prefixSumMap);
        
        prefixSumMap.put(currSum, prefixSumMap.get(currSum) - 1);
        
        return count;
    }
}