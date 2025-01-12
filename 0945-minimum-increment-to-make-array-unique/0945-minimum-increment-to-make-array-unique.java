class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int cnt = 0;

        for(int i=1; i<n; i++){
            if(nums[i] <= nums[i-1]){
                int increment = nums[i-1] - nums[i] + 1;
                nums[i] += increment;
                cnt += increment;
            }
        }
        return cnt;
    }
}