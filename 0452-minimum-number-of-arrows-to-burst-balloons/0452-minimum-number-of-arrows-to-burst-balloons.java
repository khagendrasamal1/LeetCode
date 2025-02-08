class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int arrows = 1;

        int prevStart = points[0][0], prevEnd = points[0][1];

        for(int i=1; i<n; i++){
            int currStart = points[i][0], currEnd = points[i][1];

            if(currStart > prevEnd){
                prevStart = currStart;
                prevEnd = currEnd;
                arrows++;
            }else{
                prevStart = Math.max(prevStart, currStart);
                prevEnd = Math.min(prevEnd, currEnd);
            }
        }
        return arrows;
    }
}