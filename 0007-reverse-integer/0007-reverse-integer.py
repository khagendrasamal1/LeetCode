class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 0:
            sign = -1
        else:
            sign = 1

        x = abs(x)

        rev = 0
        while x>0:
            digit = x%10
            rev = rev*10 + digit
            x //= 10

        rev = rev*sign

        if rev > -2**31 and rev < 2**31 - 1:
            return rev

        return 0
        