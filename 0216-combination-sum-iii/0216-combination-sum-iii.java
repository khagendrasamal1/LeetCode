class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();

        recur(k, n, 1, ans, list);

        return ans;
    }

    void recur(int k, int n, int ele, List<List<Integer>> ans, List<Integer> list){
        if(list.size() >= k){
            if(n == 0){
                ans.add(new ArrayList<Integer>(list));
            }
            return;
        }

        for(int i=ele; i<=9; i++){
            if(i <= n){
                list.add(i);
                recur(k, n-i, i+1, ans, list);
                list.remove(list.size()-1);
            }
        }
    }
}