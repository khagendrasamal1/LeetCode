class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        if(n <= 1)  return n;

        int up = 0;
        int down = 0;
        int slope = 0;
        int candies = 0;

        for(int i=1; i<n; i++){
            int curr = ratings[i] > ratings[i-1] ? 1 :
                        (ratings[i] < ratings[i-1] ? -1 : 0);

            if((slope < 0 && curr >= 0) || (slope > 0 && curr == 0)){
                candies += sum(up) + sum(down) + Math.max(up, down);
                up = 0;
                down = 0;
            }
            if(curr > 0)    up++;
            else if(curr < 0)   down++;
            else    candies++;

            slope = curr;
        }

        candies += sum(up) + sum(down) + Math.max(up, down)+1;

        return candies;
    }

    public int sum(int n){
        return (n*(n+1))/2;
    }
}