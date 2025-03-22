class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1)  return nums[0];
        if(n == 2)  return Math.max(nums[0], nums[1]);

        int dp[] = new int[n-1];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<n-1; i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }

        int dp1[] = new int[n];

        dp1[1] = nums[1];
        dp1[2] = Math.max(nums[1], nums[2]);

        for(int i=3; i<n; i++){
            dp1[i] = Math.max(dp1[i-2]+nums[i], dp1[i-1]);
        }

        return Math.max(dp[dp.length-1], dp1[dp1.length-1]);
    }
}