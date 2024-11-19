class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> st = new ArrayList<>();

        for(int ele : asteroids){
            if(ele > 0){
                st.add(ele);
            }else{
                while(!st.isEmpty() && st.get(st.size()-1) > 0 && st.get(st.size()-1) < Math.abs(ele)){
                    st.remove(st.size()-1);
                }
                if(!st.isEmpty() && st.get(st.size()-1) == Math.abs(ele)){
                    st.remove(st.size()-1);
                }else if(st.isEmpty() || st.get(st.size()-1) < 0){
                    st.add(ele);
                }
            }
        }

        int ans[] = new int[st.size()];
        for(int i=0; i<st.size(); i++){
            ans[i] = st.get(i);
        }

        return ans;
    }
}