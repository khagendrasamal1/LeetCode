class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();

        int arr[] = new int[26];

        for(String b : words2){
            int temp[] = new int[26];
            for(char c : b.toCharArray()){
                temp[c-'a']++;
                arr[c-'a'] = Math.max(arr[c-'a'], temp[c-'a']);
            }
        }

        for(String a : words1){
            int temp[] = new int[26];
            for(char c : a.toCharArray()){
                temp[c-'a']++;
            }
            if(subset(temp, arr)){
                list.add(a);
            }
        }
        return list;
    }

    public static boolean subset(int source[], int dest[]){
        for(int i=0; i<26; i++){
            if(dest[i] > source[i]){
                return false;
            }
        }
        return true;
    }
}