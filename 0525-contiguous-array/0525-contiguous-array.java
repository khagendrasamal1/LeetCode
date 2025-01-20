class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int n = nums.length;
        for(int i=0; i<n; i++){
            sum += nums[i] == 1 ? 1 : -1;

            if(map.containsKey(sum)){
                ans = Math.max(ans, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }   
        return ans;
    }
}