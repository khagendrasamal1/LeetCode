class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder string = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                string.append(Character.toLowerCase(c));
            }
        }

        int i = 0;
        int j = string.length()-1;

        while(i < j){
            if(string.charAt(j) != string.charAt(i)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}