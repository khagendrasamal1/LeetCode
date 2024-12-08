class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        // Step 1: Calculate non-circular max subarray sum using Kadane's algorithm
        int maxSum = nums[0], currMax = 0;
        int totalSum = 0; // To store the sum of all elements
        int minSum = nums[0], currMin = 0; // To find the minimum subarray sum

        for (int num : nums) {
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);

            totalSum += num;
        }

        // Step 2: Handle the circular case
        // If all elements are negative, maxSum is the answer (don't use circular sum)
        if (maxSum < 0) {
            return maxSum;
        }

        // Otherwise, take the maximum of the non-circular and circular cases
        return Math.max(maxSum, totalSum - minSum);
    }
}