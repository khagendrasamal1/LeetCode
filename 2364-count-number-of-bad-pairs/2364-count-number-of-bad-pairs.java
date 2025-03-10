class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;

        long total = (long) n * (n-1) / 2;

        Map<Integer, Integer> map = new HashMap<>();
        long cnt = 0;

        for(int i=0; i<n; i++){
            int diff = nums[i] - i;

            if(map.containsKey(diff)){
                cnt += map.get(diff);
            }

            map.put(diff, map.getOrDefault(diff, 0)+1);
        }

        return total - cnt;
    }
}