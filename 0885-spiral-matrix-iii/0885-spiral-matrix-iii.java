class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int n = rows*cols;
        int res[][] = new int[n][2];
        res[0][0] = rStart;
        res[0][1] = cStart;

        int count = 1;
        int index = 0;
        int step = 1;

        int direction[][] = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        while(count<n){
            for(int times=0; times<2; times++){
                int dr = direction[index%4][0];
                int dc = direction[index%4][1];
                for(int i=0; i<step;i++){
                    rStart += dr;
                    cStart += dc;
                    if(cStart>= 0 && cStart<cols && rStart>=0 && rStart<rows){
                        res[count][0] = rStart;
                        res[count][1] = cStart;
                        count++;
                    }
                }
                index++;
            }
            step++;
        }
        return res;
    }
}