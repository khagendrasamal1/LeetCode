class Solution(object):
    def arrayRankTransform(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        sortArr = sorted(arr)

        freq = {}
        r = 1

        for num in sortArr:
            if num not in freq:
                freq[num] = r
                r += 1

        for i in range(len(arr)):
            arr[i] = freq[arr[i]]
        
        return arr