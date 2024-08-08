class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        permuteHelper(nums, 0, new ArrayList<>(), permutations);
        return permutations;
    }

    private void permuteHelper(int[] nums, int index, List<Integer> currentPerm, List<List<Integer>> permutations) {
        // Base case: if we've reached the end of the array, add the current permutation
        if (index == nums.length) {
            permutations.add(new ArrayList<>(currentPerm));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Check if the current number has already been used (avoid duplicates)
            if (!currentPerm.contains(nums[i])) {
                currentPerm.add(nums[i]);  // Add the number to the current permutation
                permuteHelper(nums, index + 1, currentPerm, permutations);  // Recursively explore permutations with the current number
                currentPerm.remove(currentPerm.size() - 1); // Backtrack: remove the number for other possibilities
            }
        }
    }
}
