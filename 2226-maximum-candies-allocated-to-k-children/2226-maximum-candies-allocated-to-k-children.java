class Solution {
    public int maximumCandies(int[] candies, long k) {
        if(k == 0)  return 0;

        int ans = 0;

        int low = 1; 
        int high = Integer.MIN_VALUE;

        for(int c : candies){
            high = Math.max(c, high);
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            long cnt = 0;

            for(int c : candies){
                cnt += c/mid;
            }

            if(cnt >= k){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}