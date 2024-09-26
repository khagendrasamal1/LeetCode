class Solution {

    public int nCr(int n, int r){
        long ans = 1;

        for(int i=0; i<r; i++){
            ans *= (n-i);
            ans /= (i+1);
        }
        return (int)ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int row=1; row<=numRows; row++){
            List<Integer> temp = new ArrayList<>();
            for(int col=1; col<=row; col++){
                temp.add(nCr(row-1, col-1));
            }
            res.add(temp);
        }
        return res;
    }
}