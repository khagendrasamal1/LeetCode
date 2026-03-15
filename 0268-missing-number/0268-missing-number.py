class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)

        arr_sum = 0

        for i in nums:
            arr_sum += i

        natural_sum = n * (n+1) // 2

        return natural_sum - arr_sum

        