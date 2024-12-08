class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int maxElement = nums[0];
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
        }
        if (maxElement < 0) {
            return maxElement; // All elements are negative
        }

        int[] temp = new int[n];
        int curr = 0, maxi = 0;

        for (int i = n - 1; i >= 0; i--) {
            curr += nums[i];
            maxi = Math.max(maxi, curr);
            temp[i] = maxi;
        }

        int ans = nums[0], pre = 0;
        curr = 0;

        for (int i = 0; i < n; i++) {
            curr += nums[i];
            ans = Math.max(ans, curr);
            curr = Math.max(0, curr);

            ans = Math.max(ans, pre + temp[i]);
            pre += nums[i];
        }

        return ans;
    }
}