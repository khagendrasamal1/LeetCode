class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;

        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        int maxSum = sum;

        int end = k;

        while(end < n){
            sum = sum - nums[end-k] + nums[end];
            maxSum = Math.max(sum, maxSum);
            end++;
        }
        return (double)maxSum / k;
    }
}