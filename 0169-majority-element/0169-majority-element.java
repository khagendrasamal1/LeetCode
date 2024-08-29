class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int ele = -1;
        for(int i=0; i<nums.length; i++){
            if(cnt == 0){
                cnt = 1;
                ele = nums[i];
            }
            else if(nums[i] == ele){
                cnt++;
            }else{
                cnt--;
            }
        }
        return ele;
    }
}