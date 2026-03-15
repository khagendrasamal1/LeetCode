class Solution(object):
    def prefixCount(self, words, pref):
        """
        :type words: List[str]
        :type pref: str
        :rtype: int
        """
        cnt = 0

        for word in words:
            if word.startswith(pref):
                cnt += 1

        return cnt
        