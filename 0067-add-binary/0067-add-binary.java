class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length()-1;
        int n2 = b.length()-1;

        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int carry = 0;

        while(n1 >= 0 || n2 >= 0 || carry > 0){
            int t1 = 0;
            int t2 = 0;

            if(n1 >= 0){
                t1 = a.charAt(n1--)-'0';
            }
            if(n2 >= 0){
                t2 = b.charAt(n2--)-'0';
            }

            sum = t1+t2+carry;
            sb.append(sum % 2);
            carry = sum/2;
        }

        return sb.reverse().toString();
    }
}