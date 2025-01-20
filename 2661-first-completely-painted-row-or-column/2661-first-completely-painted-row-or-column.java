class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int rowCnt[] = new int[n];
        int colCnt[] = new int[m];

        Map<Integer, int[]> map = new HashMap<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map.put(mat[i][j], new int[]{i, j});
            }
        }
        int totalCells = n*m;

        for(int i=0; i<totalCells; i++){
            int cell[] = map.get(arr[i]);
            rowCnt[cell[0]]++;
            colCnt[cell[1]]++;

            if(rowCnt[cell[0]] == m || colCnt[cell[1]] == n){
                return i;
            }
        }
        return -1;
    }
}