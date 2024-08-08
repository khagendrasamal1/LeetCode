class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = start+2*i;
            xor = xor^nums[i];
        }
        return xor;
    }
}