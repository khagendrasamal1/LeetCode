class Solution(object):
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        min_heap = []

        for i in nums:
            heapq.heappush(min_heap, i)

            if len(min_heap) > k:
                heapq.heappop(min_heap)

        return min_heap[0]
        