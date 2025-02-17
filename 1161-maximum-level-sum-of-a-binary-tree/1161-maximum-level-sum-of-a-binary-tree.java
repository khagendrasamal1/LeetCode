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
    public int maxLevelSum(TreeNode root) {
        int maxLevel = 0, currLevel = 1, maxSum = Integer.MIN_VALUE;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            int sum = 0;
            int size = que.size();

            for(int i=0; i<size; i++){
                TreeNode curr = que.poll();

                sum += curr.val;

                if(curr.left != null)   que.add(curr.left);
                if(curr.right != null)  que.add(curr.right);
            }

            if(sum > maxSum){
                maxSum = sum;
                maxLevel = currLevel;
            }

            currLevel++;
        }
        return maxLevel;
    }
}