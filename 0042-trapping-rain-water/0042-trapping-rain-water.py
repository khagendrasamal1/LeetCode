class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        i = 0
        j = len(height) - 1

        water = 0
        max_left, max_right = 0, 0

        while i < j:
            if height[i] <= height[j]:
                max_left = max(height[i], max_left)
                water += max_left - height[i]
                i += 1
            else:
                max_right = max(height[j], max_right)
                water += max_right - height[j]
                j -= 1
        return water
