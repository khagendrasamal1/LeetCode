class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;

        if(n == 0)  return ans;

        long exp = n;
        boolean isNegative = (n < 0);
        exp = Math.abs(exp);

        while(exp > 0){
            if(exp % 2 == 1){
                ans *= x;
            }
            x *= x;
            exp /= 2;
        }
        return isNegative ? 1.0 / ans : ans;
    }
}