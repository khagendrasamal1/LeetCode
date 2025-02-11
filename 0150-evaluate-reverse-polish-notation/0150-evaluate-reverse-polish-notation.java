class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String optr = "+-*/";

        for(String token : tokens){
            if(optr.indexOf(token) != -1){
                int d2 = st.pop();
                int d1 = st.pop();
                int ans = 0;
                if(token.equals("+")){
                    ans = d1+d2;
                }else if(token.equals("-")){
                    ans = d1-d2;
                }else if(token.equals("*")){
                    ans = d1*d2;
                }else if(token.equals("/")){
                    ans = d1/d2;
                }
                st.push(ans);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}