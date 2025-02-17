class Solution {
    public int numTilePossibilities(String tiles) {
        int freq[] = new int[26];

        for(char ch : tiles.toCharArray()){
            freq[ch - 'A']++;
        }

        return dfs(freq);
    }

    public int dfs(int freq[]){
        int cnt = 0;

        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                cnt++;
                freq[i]--;

                cnt += dfs(freq);

                freq[i]++;
            }
        }
        return cnt;
    }
}