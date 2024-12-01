class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1 = s.length(); 
        int n2 = p.length(); 

        if (n2 > n1) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>(); 
        int[] reference = new int[26]; 
        int[] slide = new int[26];     

        for (char c : p.toCharArray()) {
            reference[c - 'a']++;
        }

        for (int i = 0; i < n2; i++) {
            slide[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(reference, slide)) {
            ans.add(0);
        }

        for (int i = n2; i < n1; i++) {
            slide[s.charAt(i - n2) - 'a']--;

            slide[s.charAt(i) - 'a']++;

            if (Arrays.equals(reference, slide)) {
                ans.add(i - n2 + 1);
            }
        }

        return ans;
    }
}
