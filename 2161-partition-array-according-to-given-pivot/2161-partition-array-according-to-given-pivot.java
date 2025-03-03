class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;

        int lcnt = 0, pcnt = 0, gcnt = 0;

        for(int num : nums){
            if(num < pivot){
                lcnt++;
            }else if(num > pivot){
                gcnt++;
            }else{
                pcnt++;
            }
        }

        int ans[] = new int[n];

        int i = 0, j = lcnt, k = lcnt + pcnt;

        for(int num : nums){
            if(num < pivot){
                ans[i] = num;
                i++;
            }else if(num > pivot){
                ans[k] = num;
                k++;
            }else{
                ans[j] = num;
                j++;
            }
        }
        return ans;
    }
}