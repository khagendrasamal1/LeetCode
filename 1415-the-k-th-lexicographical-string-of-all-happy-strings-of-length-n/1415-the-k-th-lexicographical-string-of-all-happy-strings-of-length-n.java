class Solution {
    String ans;
    int cnt;
    public String getHappyString(int n, int k) {
        ans = "";
        cnt = 0;

        backtrack(n, k, new StringBuilder(""));

        return ans;
    }

    public boolean backtrack(int n, int k, StringBuilder sb){
        if(sb.length() == n){
            cnt++;
            if(cnt == k){
                ans = sb.toString();
                return true;
            }
            return false;
        }

        for(char ch='a'; ch<='c'; ch++){
            if(sb.length()>0 && sb.charAt(sb.length()-1) == ch) continue;

            sb.append(ch);

            if(backtrack(n, k, sb)){
                return true;
            }
            sb.deleteCharAt(sb.length()-1);
        }
        return false;
    }
}