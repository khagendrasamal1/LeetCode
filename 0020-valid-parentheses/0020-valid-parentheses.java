class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for(char it : s.toCharArray()){
            if(it == '(' || it == '[' || it == '{'){
                st.push(it);
            }
            else{
                char ch = st.pop();
                if(st.isEmpty()){
                    return false;
                }else{
                    if((it == ')' && ch=='(') || (it == ']' && ch=='[') || (it == '}' && ch=='{'))  continue;
                    else return false;
                }
            }
        }
        return st.isEmpty();
    }
}