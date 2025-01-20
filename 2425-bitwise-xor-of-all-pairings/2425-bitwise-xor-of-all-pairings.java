class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;

        int n = nums1.length, m = nums2.length;

        if(n % 2 != 0){
            for(int num : nums2){
                ans ^= num;
            }
        }

        if(m % 2 != 0){
            for(int num : nums1){
                ans ^= num;
            }
        }
        return ans;
    }
}