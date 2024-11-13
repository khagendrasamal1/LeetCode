class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int i=0;
        int j=n-1;

        int maxArea = Integer.MIN_VALUE;

        while(i<j){
            int area = Math.min(height[i], height[j]) * (j-i);

            maxArea = Math.max(area, maxArea);

            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}