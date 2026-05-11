class Solution(object):
    def findTheWinner(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: int
        """
        ans = 0

        for i in range(2, n+1):
            ans = (ans + k) % i
        
        return ans+1

        