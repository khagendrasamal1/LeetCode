class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n < 3)   return n;

        int ind = 2;

        for(int i=2; i<n; i++){
            if(nums[i] != nums[ind-2]){
                nums[ind] = nums[i];
                ind++;
            }
        }
        return ind;
    }
}