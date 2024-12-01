class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr = 0;
        int window = Integer.MAX_VALUE;

        int start = 0;
        int end = 0;

        for(end=0; end<nums.length; end++){
            curr += nums[end];
            while(curr >= target){
                window = Math.min(window, end-start+1);

                curr -= nums[start];
                start++;
            }
        }
        return window == Integer.MAX_VALUE ? 0 : window;
    }
}