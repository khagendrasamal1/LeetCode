class Solution {
    public int[] constructDistancedSequence(int n) {
        int len = 2 * n - 1;  
        int[] result = new int[len];  
        boolean[] used = new boolean[n + 1]; 
        backtrack(result, used, n, 0);
        return result;
    }

    private boolean backtrack(int[] result, boolean[] used, int n, int index) {
        if (index == result.length) {
            return true;
        }
        
        if (result[index] != 0) {
            return backtrack(result, used, n, index + 1);
        }

        for (int i = n; i >= 1; i--) {
            if (used[i]) continue; 
            
            if (i == 1) { 
                result[index] = 1;
                used[1] = true;
                if (backtrack(result, used, n, index + 1)) {
                    return true;
                }
                result[index] = 0;
                used[1] = false;
            } else {
                if (index + i < result.length && result[index + i] == 0) {
                    result[index] = i;
                    result[index + i] = i;
                    used[i] = true;
                    
                    if (backtrack(result, used, n, index + 1)) {
                        return true;
                    }
                    
                    result[index] = 0;
                    result[index + i] = 0;
                    used[i] = false;
                }
            }
        }
        return false;
    }
}