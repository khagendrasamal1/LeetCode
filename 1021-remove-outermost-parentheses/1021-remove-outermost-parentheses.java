class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(cnt > 0){
                    sb.append(c);
                }
                cnt++;
            }else if(c == ')'){
                cnt--;
                if(cnt > 0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}