class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        seen = set(nums1)
        ans = []

        for num in nums2:
            if num in seen:
                if num not in ans:
                    ans.append(num)

        return ans