class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr = nums[0]
        maxi = nums[0]

        for i in range(1, len(nums)):
            curr = max(nums[i], nums[i]+curr)
            maxi = max(maxi, curr)

        return maxi