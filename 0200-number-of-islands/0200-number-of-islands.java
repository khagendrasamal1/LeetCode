class Solution {
    static class Pair{
        int row, col;
        Pair(int r, int c){
            this.row = r;
            this.col = c;
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int islands = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    islands++;
                    bfs(i, j, vis, grid);
                }
            }
        }
        return islands;
    }

    public void bfs(int i, int j, int[][] vis, char grid[][]){
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(i, j));

        vis[i][j] =1;

        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();

            int[] drow = {-1, 0, 1, 0};
            int[] dcol = {0, 1, 0, -1};

            for(int f=0; f<4; f++){
                int nrow = row + drow[f];
                int ncol = col + dcol[f];

                if(nrow>=0 && ncol<m && ncol>=0 && nrow<n && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
    }
}