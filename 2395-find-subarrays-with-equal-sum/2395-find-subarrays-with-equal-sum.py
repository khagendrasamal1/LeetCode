class Solution(object):
    def findSubarrays(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        n = len(nums)
        seen = set()

        for i in range(n-1):
            add = nums[i] + nums[i+1]

            if add in seen:
                return True

            seen.add(add)

        return False