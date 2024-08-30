class Solution {
    public int minOperations(int[] nums, int k) {
        int steps = 0;

        for(int num : nums){
            if(num < k){
                steps++;
            }
        }
        return steps;
    }
}