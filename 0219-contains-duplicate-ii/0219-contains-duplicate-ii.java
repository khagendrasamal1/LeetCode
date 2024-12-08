class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(m.containsKey(nums[i])){
                int idx = m.get(nums[i]);
                if((i-idx) <= k)    return true;
                else{
                    m.put(nums[i], i);
                }
            }else{
                m.put(nums[i], i);
            }
        }
        return false;
    }
}