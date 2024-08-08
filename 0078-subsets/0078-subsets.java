class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsetsRec(nums, new ArrayList<>(), ans, 0);
        return ans;
    }

    public void subsetsRec(int[] nums, List<Integer> current, List<List<Integer>> ans, int itr){
        // Base case
        if(itr == nums.length){
            ans.add(new ArrayList<>(current)); // Add a copy of current list to the result
            return;
        }
        // Include the current element
        current.add(nums[itr]);
        subsetsRec(nums, current, ans, itr + 1);

        // Exclude the current element
        current.remove(current.size() - 1); // Corrected the method to remove last element
        subsetsRec(nums, current, ans, itr + 1);
    }
}