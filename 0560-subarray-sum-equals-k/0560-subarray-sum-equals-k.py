class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        freq = {0: 1}
        curr = 0
        cnt = 0

        for num in nums:
            curr += num

            if (curr-k) in freq:
                cnt += freq[curr-k]
            freq[curr] = freq.get(curr, 0)+1

        return cnt