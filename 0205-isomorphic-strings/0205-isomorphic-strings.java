class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Boolean> m2 = new HashMap<>();

        int n = s.length();

        for(int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(m1.containsKey(ch1) == true){
                if(m1.get(ch1) != ch2){
                    return false;
                }
            }else{
                if(m2.containsKey(ch2) == true){
                    return false;
                }else{
                    m1.put(ch1, ch2);
                    m2.put(ch2, true);
                }
            }
        }
        return true;
    }
}