class Solution(object):
    def findErrorNums(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        repeat = 0
        miss = 0
        freq = {}

        for num in nums:
            freq[num] = freq.get(num, 0)+1

        for num in freq:
            if freq[num] == 2:
                repeat = num
        
        for num in range(1, n+1):
            if freq.get(num, 0) == 0:
                miss = num
        
        return [repeat, miss]

        