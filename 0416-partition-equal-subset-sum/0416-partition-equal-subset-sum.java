class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        
        for(int i=0; i<n; i++){
            totalSum += nums[i];
        }
        
        if(totalSum %2 == 1){
            return false;
        }
        
        int target = totalSum/2;
        
        boolean dp[] = new boolean[target+1];
        dp[0] = true;

        for(int num : nums){
            for(int j=target; j>=num; j--){
                dp[j] = dp[j] || dp[j-num];
            }
        }

        return dp[target];
    }
}