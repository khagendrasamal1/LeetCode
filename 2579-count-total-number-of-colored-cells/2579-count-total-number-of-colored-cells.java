class Solution {
    public long coloredCells(int n) {
        long ans = n;

        return 1 + (ans-1) * ans * 2;
    }
}