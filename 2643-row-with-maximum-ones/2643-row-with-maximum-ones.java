class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int max_count = -1;
        int max_row = -1;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > max_count){
                max_count = count;
                max_row = i;
            }
        }
        return new int[]{max_row, max_count};
    }
}