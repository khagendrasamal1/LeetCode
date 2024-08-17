class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums1){
            set.add(n);
        }

        HashSet<Integer> intersect = new HashSet<>();
        for(int n : nums2){
            if(set.contains(n)){
                intersect.add(n);
            }
        }

        int ans[] = new int[intersect.size()];
        int i=0;
        for(int n : intersect){
            ans[i++] = n;
        }
        return ans;
    }
}