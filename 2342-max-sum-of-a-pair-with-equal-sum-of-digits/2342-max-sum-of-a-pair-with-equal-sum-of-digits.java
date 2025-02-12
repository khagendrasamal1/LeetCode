class Solution {
    public int maximumSum(int[] nums) {
        int arr[] = new int[82];

        int ans = -1;

        for(int num : nums){
            int digitSum = getSum(num);

            if(arr[digitSum] > 0){
                int prev = arr[digitSum];
                ans = Math.max(prev+num, ans);
                arr[digitSum] = Math.max(prev, num);
            }else{
                arr[digitSum] = num;
            }
        }
        return ans;
    }

    public int getSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}