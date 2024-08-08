class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCons = 0;
        int maxCons = 0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            currCons++;
        }else{
            currCons=0;
        }
        maxCons=Math.max(currCons,maxCons);
        }
        return maxCons;
    }
    
}