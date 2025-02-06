class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int res = nums[i] * nums[j];
                map.put(res, map.getOrDefault(res, 0)+1);
            }
        }

        int ans = 0, comb = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int product = entry.getKey();
            int cnt = entry.getValue();

            if(cnt >= 2){
                comb = (cnt * (cnt-1))/2;
                ans = ans + comb*8;
            }
        }
        return ans;
    }
}