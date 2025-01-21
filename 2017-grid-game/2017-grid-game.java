class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;

        long topSum = 0;
        for(int i=0; i<n; i++){
            topSum += grid[0][i];
        }
        long ans = Long.MAX_VALUE;
        long bottomSum = 0;
        for(int i=0; i<n; i++){
            topSum -= grid[0][i];
            ans = Math.min(ans, Math.max(bottomSum, topSum));
            bottomSum += grid[1][i];
        }
        return ans;
    }
}