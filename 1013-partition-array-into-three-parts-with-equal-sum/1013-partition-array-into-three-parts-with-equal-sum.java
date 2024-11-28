class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        if(sum % 3 != 0)    return false;

        int currSum = 0;
        int count = 0;
        
        for(int i=0; i<n; i++){
            currSum += arr[i];

            if(currSum == sum/3){
                currSum = 0;
                count++;

                if(count == 2 && i < n-1){
                    return true;
                }
            }
        }
        return false;
    }
}