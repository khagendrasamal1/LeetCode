class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] mat = new int[k][2];

        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> Integer.compare(x[0] * x[0] + x[1] * x[1], y[0] * y[0] + y[1] * y[1]));


        for(int[] p : points){
            pq.offer(p);
        }

        for(int i=0; i<k; i++){
            mat[i] = pq.poll();
        }
        return mat;
    }
}