class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        summ = 0

        for num in nums:
            summ += num

        arr_sum = (n * (n+1)) // 2

        return arr_sum - summ
        