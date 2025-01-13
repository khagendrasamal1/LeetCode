class Solution {
    public int minimumLength(String s) {
        int n = s.length();

        if(n <= 2)  return n;

        int freq[] = new int[26];

        for(int i=0; i<n; i++){
            freq[s.charAt(i) - 'a']++;
        }

        int cnt = 0;
        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                if(freq[i] % 2 == 0){
                    cnt += 2;
                }else{
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
}