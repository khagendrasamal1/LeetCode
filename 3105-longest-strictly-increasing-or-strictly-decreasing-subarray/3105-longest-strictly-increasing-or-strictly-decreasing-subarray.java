class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        int longest = 1;
        int incr = 1, decr = 1;

        for(int i=1; i<n; i++){
            if(nums[i] > nums[i-1]){
                incr++;
            }else{
                incr = 1;
            }

            if(nums[i] < nums[i-1]){
                decr++;
            }else{
                decr = 1;
            }
            int longer = Math.max(incr, decr);
            longest = Math.max(longest, longer);
        }
        return longest;
    }
}