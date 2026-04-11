class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k %= n

        def rotate(i, j):
            while i<j:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
                j -= 1

        rotate(0, n-1)
        rotate(0, k-1)
        rotate(k, n-1)
        