class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int arr[] = new int[26];

        int n = s.length();

        int indA = 0;
        int indB = 0;

        while(indA < n && indB < n){
            char a = s.charAt(indA);
            int freqA = a-97;

            arr[freqA] += 1;

            char b = t.charAt(indB);
            int freqB = b-97;

            arr[freqB] -= 1;

            indA++;
            indB++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}