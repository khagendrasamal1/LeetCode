class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String arr[] = s.split(" ");

        if(arr.length != pattern.length()){
            return false;
        }

        Map<Character, String> m = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){

            char c = pattern.charAt(i);

            boolean containsKey = m.containsKey(c);

            if(m.containsValue(arr[i]) && !containsKey){
                return false;
            }else if(containsKey && !m.get(c).equals(arr[i])){
                return false;
            }else{
                m.put(c, arr[i]);
            }
        }
        return true;
    }
}