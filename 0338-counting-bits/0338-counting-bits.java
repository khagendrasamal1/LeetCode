class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        for(int i=1; i<=n; i++){
            String binary = Integer.toBinaryString(i);
            int ones = helper(binary);
            arr[i] = ones;
        }
        return arr;
    }

    public int helper(String num){
        int cnt = 0;

        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}