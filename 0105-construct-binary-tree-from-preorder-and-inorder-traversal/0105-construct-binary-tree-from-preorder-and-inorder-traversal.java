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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(inorder[i], i);
        }

        return splitTree(preorder, map, 0, 0, n-1);
    }

    static TreeNode splitTree(int pre[], Map<Integer, Integer> map, int rootInd, int left, int right){
        TreeNode root = new TreeNode(pre[rootInd]);

        int mid = map.get(pre[rootInd]);

        if(mid > left){
            root.left = splitTree(pre, map, rootInd+1, left, mid-1);
        }

        if(mid < right){
            root.right = splitTree(pre, map, rootInd+mid-left+1, mid+1, right);
        }
        return root;
    }
}