class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int n = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                n = n*10 + c-'0';
            }else if(c == '['){
                str.push(sb);
                sb = new StringBuilder();
                num.push(n);
                n = 0;
            }else if(c == ']'){
                StringBuilder temp = sb;
                sb = str.pop();
                int cnt = num.pop();

                while(cnt --> 0){
                    sb.append(temp);
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}