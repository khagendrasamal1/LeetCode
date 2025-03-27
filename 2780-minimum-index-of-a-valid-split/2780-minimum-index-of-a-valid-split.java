class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int ele = -1, cnt = 0;

        for(int num : nums){
            if(cnt == 0){
                ele = num;
            }

            cnt += (num == ele) ? 1 : -1;
        }

        int total = 0;

        for(int num : nums){
            if(ele == num){
                total++;
            }
        }

        int leftCnt = 0;

        for(int i=0; i<n-1; i++){
            if(nums.get(i) == ele){
                leftCnt++;
            }

            int rightCnt = total - leftCnt;
            int leftSize = i+1;
            int rightSize = n - leftSize;

            if(leftCnt*2 > leftSize && rightCnt*2 > rightSize){
                return i;
            }
        }
        return -1;
    }
}