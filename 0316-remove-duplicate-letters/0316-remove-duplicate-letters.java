class Solution {
    public String removeDuplicateLetters(String s) {
        int last[] = new int[26];
        boolean vis[] = new boolean[26];

        StringBuilder ans = new StringBuilder();

        int n = s.length();

        for(int i=0; i<n; i++){
            last[s.charAt(i) - 'a'] = i;
        }

        for(int i=0; i<n; i++){
            char currChar = s.charAt(i);

            if(vis[currChar - 'a'])   continue;

            while(ans.length() > 0 && ans.charAt(ans.length()-1) > currChar && last[ans.charAt(ans.length()-1) - 'a'] > i){
                vis[ans.charAt(ans.length()-1)-'a'] = false;
                ans.deleteCharAt(ans.length()-1);
            }
            ans.append(currChar);
            vis[currChar - 'a'] = true;
        }
        return ans.toString();
    }
}