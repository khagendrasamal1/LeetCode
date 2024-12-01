class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));

        int n = intervals.length;

        int cnt = 1;
        int lastEnd = intervals[0][1];

        for(int i=1; i<n; i++){
            if(intervals[i][0] >= lastEnd){
                cnt++;
                lastEnd = intervals[i][1];
            }
        }
        return n-cnt;
    }
}