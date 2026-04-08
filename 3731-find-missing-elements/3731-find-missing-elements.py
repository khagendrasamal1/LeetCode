class Solution(object):
    def findMissingElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        small = min(nums)
        large = max(nums)

        seen = set(nums)
        ans = []

        for i in range(small, large+1):
            if i not in seen:
                ans.append(i)

        return ans

        