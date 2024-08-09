class Solution {
    public int[] sortedSquares(int[] nums) {
        int sortedSquares[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sortedSquares[i]=nums[i]*nums[i];
        }
        Arrays.sort(sortedSquares);
        return sortedSquares;
        
    }
}