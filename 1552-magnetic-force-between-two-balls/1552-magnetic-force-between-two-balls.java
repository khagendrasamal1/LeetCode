class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        return cow(position,m);   
    }
    public static int cow(int stable[], int cows){
        int i=1, ans=-1;
        int j=stable[stable.length-1]-stable[0];
        while(i<=j){
            int mid = i+(j-i)/2;
            if(check(stable, cows,mid)){
                ans=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }

    public static boolean check(int stable[], int cows, int mid){
        int count=1;
        int last = stable[0];
        for(int i=1;i<stable.length;i++){
            if(stable[i]-last>=mid){
                count++;
                last = stable[i];
            }
            if(count>=cows){
                return true;
            }
        }
        return false; 
    }
}