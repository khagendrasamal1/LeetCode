class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int n = s.length();

        int freq[] = new int[26];

        int indexA = 0;
        int indexB = 0;

        while(indexA < n && indexB < n){
            char charA = s.charAt(indexA);
            int freqIndexA = charA - 'a';

            freq[freqIndexA] += 1;

            char charB = t.charAt(indexB);
            int freqIndexB = charB - 'a';

            freq[freqIndexB] -= 1;

            indexA++;
            indexB++;
        }

        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}