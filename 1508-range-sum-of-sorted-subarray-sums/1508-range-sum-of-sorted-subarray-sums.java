class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> subSum = new ArrayList<>();
        int mod = 1000000007;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum=0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                subSum.add(sum);
            }
        }

        Collections.sort(subSum);
        int ans = 0;
        for(int i=left-1; i<right; i++){
            ans = (ans + subSum.get(i)) % mod;
        }
        return ans;
    }
}