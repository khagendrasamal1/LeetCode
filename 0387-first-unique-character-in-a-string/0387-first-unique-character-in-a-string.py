class Solution:
    def firstUniqChar(self, s: str) -> int:
        ind = -1

        freq = {}

        for ch in s:
            freq[ch] = freq.get(ch, 0)+1

        for i in range(len(s)):
            if freq[s[i]] == 1:
                ind = i
                break

        return ind