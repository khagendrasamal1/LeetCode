class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size()-1);
        int maxDiff = 0;

        for(int i=1; i<arrays.size()-1; i++){
            List<Integer> arr = arrays.get(i);

            maxDiff = Math.max(maxDiff, Math.abs(arr.get(arr.size()-1) - minVal));
            maxDiff = Math.max(maxDiff, Math.abs(arr.get(0) - maxVal));
            maxVal = Math.max(maxVal, arr.get(arr.size()-1));
            minVal = Math.min(minVal, arr.get(0));
        }
        return maxDiff;
    }
}