class Solution:
    def findGCD(self, nums: List[int]) -> int:
        a = nums[0]
        b = nums[0]

        for i in nums:
            if i < a:
                a = i
            if i > b:
                b = i

        while b != 0:
            a, b = b, a%b

        return a