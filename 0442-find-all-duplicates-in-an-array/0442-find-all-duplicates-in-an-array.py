class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans = set()

        freq = {}

        for num in nums:
            freq[num] = freq.get(num, 0)+1

        for num in nums:
            if freq[num] > 1:
                ans.add(num)

        return list(ans)     