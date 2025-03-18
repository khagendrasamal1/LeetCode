class Solution {
    public int getMaxLen(int[] nums) {
        int pos = 0, neg = 0, max = 0;

        for(int num : nums){
            if(num > 0){
                pos++;
                neg = (neg > 0) ? neg + 1 : 0;
            }else if(num < 0){
                int temp = pos;
                pos = (neg > 0) ? neg + 1 : 0;
                neg = temp + 1;
            }else{
                neg = 0;
                pos = 0;
            }
            max = Math.max(pos, max);
        }
        return max;
    }
}