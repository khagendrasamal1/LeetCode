class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for(int ind=0; ind<nums.length; ind++){
            if(nums[ind] <= i){
                i = nums[ind];
            }else if(nums[ind] <= j){
                j = nums[ind];
            }else{
                return true;
            }
        }
        return false;
    }
}