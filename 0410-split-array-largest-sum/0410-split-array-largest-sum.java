class Solution {

    public static boolean check(int arr[], int mid, int stud){
        int currStud=1;
        int currSum=0;
        for(int i:arr){
            if(currSum+i<=mid){
                currSum+=i;
            }else{
                currStud++;
                if(currStud>stud || i>mid)  return false;
                currSum=i;
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int ans=-1;
        int i=0;
        int j= Arrays.stream(nums).sum();
        while(i<=j){
            int mid = i+(j-i)/2;
            if(check(nums,mid,k)){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}