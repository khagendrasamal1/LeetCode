class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;

        for(int n : nums){
            if(n != val){
                nums[cnt] = n;
                cnt++;
            }
        }
        return cnt;
    }
}