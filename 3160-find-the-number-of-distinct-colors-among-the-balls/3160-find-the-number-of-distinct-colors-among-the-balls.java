class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;

        Map<Integer, Integer> ballMap = new HashMap<>();
        Map<Integer, Integer> colorMap = new HashMap<>();

        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            if(ballMap.containsKey(ball)){
                int oldColor = ballMap.get(ball);

                colorMap.put(oldColor, colorMap.get(oldColor)-1);

                if(colorMap.get(oldColor) == 0){
                    colorMap.remove(oldColor);
                }
            }
            ballMap.put(ball, color);
            colorMap.put(color, colorMap.getOrDefault(color, 0)+1);
            
            ans[i] = colorMap.size();
        }
        return ans;
    }
}