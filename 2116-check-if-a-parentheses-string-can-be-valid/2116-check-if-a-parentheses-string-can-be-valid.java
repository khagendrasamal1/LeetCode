class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) return false;

        // Left to right pass
        int openCount = 0, wildcards = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (locked.charAt(i) == '1') {
                if (ch == '(') openCount++;
                else openCount--; // ')'
            } else {
                wildcards++;
            }
            // Ensure unmatched ')' never exceeds available '(' and wildcards
            if (openCount + wildcards < 0) return false;
        }

        // Right to left pass
        int closeCount = 0;
        wildcards = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (locked.charAt(i) == '1') {
                if (ch == ')') closeCount++;
                else closeCount--; // '('
            } else {
                wildcards++;
            }
            // Ensure unmatched '(' never exceeds available ')' and wildcards
            if (closeCount + wildcards < 0) return false;
        }

        // If both passes succeed, the string can be valid
        return true;
    }
}