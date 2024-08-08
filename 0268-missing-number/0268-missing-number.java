class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int naturalSum= (n*(n+1))/2;
        int arrSum=0;
        for(int i=0;i<nums.length;i++){
            arrSum += nums[i];
        }
        int missingNum = naturalSum-arrSum;
        return missingNum;
    }

}