class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum+nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}