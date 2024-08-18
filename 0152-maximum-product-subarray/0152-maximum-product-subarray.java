class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int globalMaxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];

            int tempMax = Math.max(currentNum, Math.max(maxProduct * currentNum, minProduct * currentNum));
            int tempMin = Math.min(currentNum, Math.min(maxProduct * currentNum, minProduct * currentNum));

            maxProduct = tempMax;
            minProduct = tempMin;

            globalMaxProduct = Math.max(globalMaxProduct, maxProduct);
        }

        return globalMaxProduct;
    }
}