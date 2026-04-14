class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        n = len(nums)
        min_len = float('inf')
        i = 0
        curr = 0

        for j in range(n):
            curr += nums[j]

            while curr >= target:
                min_len = min(min_len, j-i+1)

                curr -= nums[i]
                i += 1

        return min_len if min_len != float('inf') else 0