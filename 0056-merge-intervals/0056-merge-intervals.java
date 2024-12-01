class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)   return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> ans = new ArrayList<>();

        int newInterval[] = intervals[0];

        ans.add(newInterval);

        for(int[] interval : intervals){
            if (interval[0] <= newInterval[1]) { 
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                newInterval = interval; 
                ans.add(newInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}