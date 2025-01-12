class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();

        if (n % 2 != 0) return false;

        int openCount = 0, wildcards = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (locked.charAt(i) == '1') {
                if (ch == '(') openCount++;
                else openCount--; 
            } else {
                wildcards++;
            }
            if (openCount + wildcards < 0) return false;
        }

        int closeCount = 0;
        wildcards = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (locked.charAt(i) == '1') {
                if (ch == ')') closeCount++;
                else closeCount--;
            } else {
                wildcards++;
            }
            if (closeCount + wildcards < 0) return false;
        }

        return true;
    }
}