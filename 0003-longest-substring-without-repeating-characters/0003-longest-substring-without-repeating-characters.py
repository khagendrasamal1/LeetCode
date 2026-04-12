class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        maxlen = 0
        n = len(s)
        i = 0
        freq = {}

        if n == 0:
            return 0

        for j in range(n):
            curr_char = s[j]
        
            if curr_char in freq:
                i = max(freq[curr_char]+1, i)

            freq[curr_char] = j

            maxlen = max(maxlen, j-i+1)

        return maxlen