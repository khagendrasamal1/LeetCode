class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k-1);
    }

    public int atMostK(int nums[], int k){
        int left = 0, cnt = 0, n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 1){
                k--;
            }

            while(k < 0){
                if(nums[left] % 2 == 1){
                    k++;
                }
                left++;
            }
            cnt += (i - left + 1);
        }
        return cnt;
    }
}