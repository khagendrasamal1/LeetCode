class Solution {
    public String originalDigits(String s) {
        int cnt[] = new int[26];

        for(char ch : s.toCharArray()){
            cnt[ch - 'a']++;
        }

        int num[] = new int[10];

        num[0] = cnt['z' - 'a'];
        num[2] = cnt['w' - 'a'];
        num[4] = cnt['u' - 'a'];
        num[6] = cnt['x' - 'a'];
        num[8] = cnt['g' - 'a'];

        num[1] = cnt['o' - 'a'] - num[0] - num[2] - num[4]; 
        num[3] = cnt['h' - 'a'] - num[8];
        num[5] = cnt['f' - 'a'] - num[4];
        num[7] = cnt['s' - 'a'] - num[6];
        num[9] = cnt['i' - 'a'] - num[6] - num[8] - num[5];

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<10; i++){
            while(num[i] --> 0){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}