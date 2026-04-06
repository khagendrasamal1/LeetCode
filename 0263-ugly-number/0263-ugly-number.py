class Solution(object):
    def isUgly(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n <= 0:
            return False

        factors = [2, 3, 5]

        for factor in factors:
             while n%factor == 0:
                n //= factor

        return n == 1
        