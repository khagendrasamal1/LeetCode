class Solution(object):
    def getCommon(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: int
        """
        n1 = len(nums1)
        n2 = len(nums2)

        i, j = 0, 0

        while i<n1 and j<n2:
            if nums1[i] == nums2[j]:
                return nums1[i]

            elif nums1[i] < nums2[j]: 
                i += 1
            else:
                j += 1

        return -1