class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();

        int cnt = 0, first = -1, second = -1;

        for(int i=0; i<n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                cnt++;
                if(cnt > 2) return false;

                if(first == -1){
                    first = i;
                }else{
                    second = i;
                }
            }
        }

        if(cnt == 0)    return true;

        return cnt == 2 &&
               s1.charAt(first) == s2.charAt(second) &&
               s2.charAt(first) == s1.charAt(second);
    }
}