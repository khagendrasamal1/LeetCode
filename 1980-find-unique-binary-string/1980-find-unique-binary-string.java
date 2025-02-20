class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;

        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++){
            char ch = (nums[i].charAt(i) == '0' ? '1' : '0');

            sb.append(ch);
        }
        return sb.toString();
    }
}