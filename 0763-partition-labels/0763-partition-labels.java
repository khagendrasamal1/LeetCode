class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();

        List<Integer> list = new ArrayList<>();

        int arr[] = new int[26];

        for(int i=0; i<n; i++){
            arr[s.charAt(i) - 'a'] = i;
        }

        int start = 0, end = 0;
        for(int i=0; i<n; i++){
            end = Math.max(end, arr[s.charAt(i) - 'a']);

            if(i == end){
                list.add(end - start + 1);
                start = i + 1;
            }
        }
        return list;
    }
}