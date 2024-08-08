class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==nums[j+1]){
                    return true;
                }
        }
        return false;
    }
}