class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, 1 + map.getOrDefault(n, 0));
            if(map.get(n) > 1){
                return n;
            }
        }
        return -1;
    }
}