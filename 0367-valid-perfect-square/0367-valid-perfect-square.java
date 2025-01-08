class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 1) return false;

        int left = 1, right = num;

        while(left <= right){
            int mid = left + (right-left) / 2;
            int square = mid*mid;

            if(num == square){
                return true;
            }else if(square < num){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}