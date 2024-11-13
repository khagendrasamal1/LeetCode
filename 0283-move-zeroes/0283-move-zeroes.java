class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int j = -1;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i=j+1; i<n; i++){
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }    
    }
}