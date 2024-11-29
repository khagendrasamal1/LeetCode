class Solution {
    public String convert(String s, int numRows) {
        
        StringBuilder row[] = new StringBuilder[numRows];

        for(int i=0; i<numRows; i++){
            row[i] = new StringBuilder();
        }

        int i = 0;
        int len = s.length();

        while(i < len){
            for(int ind = 0; ind < numRows && i < len; ind++) {
                row[ind].append(s.charAt(i++));
            }
            for(int ind = numRows - 2; ind > 0 && i < len; ind--) {
                row[ind].append(s.charAt(i++));
            }
        }

        StringBuilder ans = new StringBuilder();

        for(StringBuilder str : row){
            ans.append(str);
        }

        return ans.toString();
    }
}