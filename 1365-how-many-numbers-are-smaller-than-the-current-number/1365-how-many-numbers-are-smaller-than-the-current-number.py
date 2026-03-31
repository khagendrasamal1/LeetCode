class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans = []

        sort_nums = sorted(nums)
        freq = {}

        for i in range(len(sort_nums)):
            curr = sort_nums[i]

            if curr not in freq:
                freq[curr] = i

        for num in nums:
            cnt = freq[num]
            ans.append(cnt)

        return ans

        