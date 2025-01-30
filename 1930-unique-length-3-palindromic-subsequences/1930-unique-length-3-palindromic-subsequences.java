class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int cnt = 0;

        for(char ch='a'; ch<='z'; ch++){
            int first = -1;
            int last = -1;

            for(int i=0; i<n; i++){
                if(s.charAt(i) == ch){
                    if(first == -1) first = i;
                    last = i;
                }
            }

            if(first != -1 && last != -1 && first < last){
                Set<Character> set = new HashSet<>();

                for(int j=first+1; j<last; j++){
                    set.add(s.charAt(j));
                }
                cnt += set.size();
            }
        }
        return cnt;
    }
}