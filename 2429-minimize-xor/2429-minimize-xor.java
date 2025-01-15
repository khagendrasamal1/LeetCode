class Solution {
    public int minimizeXor(int num1, int num2) {
        int ans = 0;
        int bit = 31;
        int setBits = Integer.bitCount(num2);

        while(setBits > 0 && bit >= 0){
            if((num1 & (1 << bit)) != 0){
                ans = ans | (1 << bit);
                setBits--;
            }
            bit--;
        }

        bit  = 0;
        while(setBits > 0 && bit <= 32){
            if((num1 & (1 << bit)) == 0){
                ans = ans | (1 << bit);
                setBits--;
            }
            bit++;
        }
        return ans;
    }
}