class Solution(object):
    def buildArray(self, target, n):
        """
        :type target: List[int]
        :type n: int
        :rtype: List[str]
        """
        ans = []
        i = 0

        for num in range(1, n+1):
            ans.append("Push")

            if num == target[i]:
                i += 1
            else:
                ans.append("Pop")

            if i == len(target):
                break

        return ans
        