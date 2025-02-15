class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            String i2 = Integer.toString(i * i);
            if (isPartition(0, i2, i, 0)) {
                ans += (i * i);
            }
        }
        return ans;
    }

    public boolean isPartition(int j, String i2, int target, int currSum) {
        int n = i2.length();

        if (j == n) {
            return currSum == target;
        }

        for (int index = j; index < n; index++) {  
            int val = Integer.parseInt(i2.substring(j, index + 1));
            if (currSum + val > target) {  
                break;
            }
            if (isPartition(index + 1, i2, target, currSum + val)) {
                return true;
            }
        }
        return false;
    }
}
