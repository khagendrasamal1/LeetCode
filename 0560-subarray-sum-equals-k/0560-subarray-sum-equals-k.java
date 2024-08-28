class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        int left = 0, right = 0;
        long sum = nums[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) sum += nums[right];
        }

        return maxLen;
    }
}