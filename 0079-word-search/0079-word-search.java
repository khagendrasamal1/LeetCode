class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0) && help(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean help(char[][] board, int i, int j, String word, int len){
        if(len == word.length()){
            return true;
        }

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length){
            return false;
        }

        if(board[i][j] != word.charAt(len)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*';

        boolean found = help(board, i-1, j, word, len+1) || 
                        help(board, i+1, j, word, len+1) ||
                        help(board, i, j-1, word, len+1) ||
                        help(board, i, j+1, word, len+1);

        board[i][j] = temp;

        return found;
    }
}