class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int globalMaxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];

            if (currentNum < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(currentNum, maxProduct * currentNum);
            minProduct = Math.min(currentNum, minProduct * currentNum);

            globalMaxProduct = Math.max(globalMaxProduct, maxProduct);
        }

        return globalMaxProduct;
    }
}