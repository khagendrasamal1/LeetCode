class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int cnt = 0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for(int num : nums){
            sum += num;
        int rem = sum - k;

        cnt += map.getOrDefault(rem, 0);

        map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
    
}