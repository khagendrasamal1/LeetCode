class Solution {
    public int minimumPushes(String word) {
        int min=0;
        int count=0;
        int ans[] = new int[26];

        for(char ch : word.toCharArray()){
            ans[ch-'a']++;
        }

        Arrays.sort(ans);

        for(int i=25; i>=0; i--){
            int val = ans[i]*(count/8 +1);
            min += val;
            count++;
        }
        return min;
    }
}