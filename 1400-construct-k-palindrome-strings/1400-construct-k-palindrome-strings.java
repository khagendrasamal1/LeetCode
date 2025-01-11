class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();

        if(n == k)  return true;
        if(n < k)   return false;

        int cnt[] = new int[26];

        for(int i=0; i<n; i++){
            cnt[s.charAt(i) - 'a']++;
        }

        int c = 0;
        for(int i=0; i<26; i++){
            if(cnt[i] % 2 != 0) c++;
        }
        return c <= k;
    }
}