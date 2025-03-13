class Solution {
    public int singleNumber(int[] nums) {
        int once = 0, second = 0;

        for(int num : nums){
            once = ~second & (once ^ num);
            second = ~once & (second ^ num);
        }
        return once;
    }
}