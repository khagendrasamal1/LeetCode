class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> ans = new ArrayList<>();

        int[] newArr = intervals[0];
        ans.add(newArr);

        for(int[] a : intervals){
            if(a[0] <= newArr[1]){
                newArr[1] = Math.max(a[1], newArr[1]);
            }else{
                newArr = a;
                ans.add(newArr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}