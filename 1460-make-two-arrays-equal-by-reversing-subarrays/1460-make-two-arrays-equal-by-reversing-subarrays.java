class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> m1 = new HashMap<>();

        for(int ele : target){
            m1.put(ele, m1.getOrDefault(ele, 0)+1);
        }

        for(int ele : arr){
            if(!m1.containsKey(ele)){
                return false;
            }

            m1.put(ele, m1.get(ele)-1);
            if(m1.get(ele)==0){
                m1.remove(ele);
            }
        }
        return m1.isEmpty();
    }
}