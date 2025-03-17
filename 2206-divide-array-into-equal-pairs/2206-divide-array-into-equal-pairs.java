class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int cnt : map.values()){
            if(cnt % 2 != 0){
                return false;
            }
        }
        return true;
    }
}