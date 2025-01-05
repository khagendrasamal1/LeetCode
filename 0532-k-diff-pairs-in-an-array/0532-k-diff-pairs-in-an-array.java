class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        int cnt = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(k == 0){
                if(freq > 1) cnt++;
            }else{
                if(map.containsKey(num+k))  cnt++;
            }
        }
        return cnt;
    }
}