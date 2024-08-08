class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        path.add(0);
        dfs(graph, 0, result, path);
        return result;
    }

    public static void dfs(int[][] graph, int curr, List<List<Integer>> result, List<Integer> path){
        int n = graph.length;

        if(curr == n-1){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i : graph[curr]){
            path.add(i);
            dfs(graph, i, result, path);
            path.remove(path.size()-1);
        }
    }
}