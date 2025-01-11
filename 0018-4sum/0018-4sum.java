class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result; // Not enough elements for a quadruplet
        }

        // Step 1: Sort the array
        Arrays.sort(nums);
        int n = nums.length;

        // Step 2: Iterate over the array with two fixed elements
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Two-pointer approach for the remaining two elements
                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // Skip duplicates for the third element
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        // Skip duplicates for the fourth element
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target) {
                        left++; // Increase sum
                    } else {
                        right--; // Decrease sum
                    }
                }
            }
        }

        return result;
    }
}