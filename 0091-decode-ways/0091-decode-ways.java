class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        if(s == null || n == 0) return 0;
        if(s.charAt(0) == '0')  return 0;

        int dp1 = 1;
        int dp2 = 1;

        for(int i=1; i<n; i++){
            int dp = 0;

            int lenOne = s.charAt(i) - '0';
            if(lenOne >= 1 && lenOne <= 9){
                dp += dp1;
            }

            int lenTwo = Integer.parseInt(s.substring(i-1, i+1));
            if(lenTwo >= 10 && lenTwo <= 26){
                dp += dp2;
            }

            dp2 = dp1;
            dp1 = dp;
        }
        return dp1;
    }
}