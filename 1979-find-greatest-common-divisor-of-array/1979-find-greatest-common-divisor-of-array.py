class Solution(object):
    def findGCD(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        largest = nums[0]
        smallest = nums[0]
        
        for i in nums:
            if i > largest:
                largest = i
            if i < smallest:
                smallest = i

        while largest != 0:
            smallest, largest = largest, smallest%largest
        return smallest

