class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        curr = 0
        maxi = 0

        for num in nums:
            if num == 1:
                curr += 1
                maxi = max(maxi, curr)
            else:
                curr = 0

        return maxi
        