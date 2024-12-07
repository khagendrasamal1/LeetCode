class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            return nums;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = nums[i];
        }
 
        left = sortArray(left);
        right = sortArray(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int l = left.length, r = right.length;
        int[] merged = new int[l + r];
        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < l) {
            merged[k++] = left[i++];
        }
        
        while (j < r) {
            merged[k++] = right[j++];
        }

        return merged;
    }
}
