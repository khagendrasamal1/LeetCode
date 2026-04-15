class Solution:
    def reverse(self, x: int) -> int:

        sign = -1 if x < 0 else 1
        temp = abs(x)

        new = 0
        while temp > 0:
            digit = temp%10
            new = new * 10 + digit
            temp //= 10
        
        new = new * sign

        if new < -2**31 or new > 2**31 - 1:
            return 0

        return new