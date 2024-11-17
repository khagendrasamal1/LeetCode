/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1;
        int j = n;

        while(i <= j){
            int mid = i + (j-i)/2;
            int g = guess(mid);

            if(g == 0){
                return mid;
            }else if(g == 1){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return -1;
    }
}