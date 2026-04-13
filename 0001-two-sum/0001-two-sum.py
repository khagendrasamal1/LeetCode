class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        freq = {}

        for i, num in enumerate(nums):
            diff = target - num
            if diff in freq:
                return [i, freq[diff]]
            freq[num] = i
        