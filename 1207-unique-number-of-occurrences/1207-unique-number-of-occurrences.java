class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : arr){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n, 1);
            }
        }

        Set<Integer> set = new HashSet<>(map.values());

        if(map.size() == set.size()){
            return true;
        }
        return false;
    }
}