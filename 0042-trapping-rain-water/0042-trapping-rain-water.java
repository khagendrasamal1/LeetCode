class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length-1;

        int maxLeft = 0;
        int maxRight = 0;
        int water = 0;

        while(i < j){
            if(height[i] <= height[j]){
                maxLeft = Math.max(height[i], maxLeft);
                water += maxLeft - height[i];
                i++;
            }else{
                maxRight = Math.max(height[j], maxRight);
                water += maxRight - height[j];
                j--;
            }
        }
        return water;
    }
}