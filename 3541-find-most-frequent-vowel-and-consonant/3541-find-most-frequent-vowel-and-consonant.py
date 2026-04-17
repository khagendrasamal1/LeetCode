class Solution(object):
    def maxFreqSum(self, s):
        """
        :type s: str
        :rtype: int
        """
        freq = {}

        vowel = 0
        consonant = 0

        for ch in s:
            freq[ch] = freq.get(ch, 0)+1

        for ch in s:
            if ch in 'aeiou':
                if freq[ch] > vowel:
                    vowel = freq[ch]
            else:
                if freq[ch] > consonant:
                    consonant = freq[ch]

        return vowel + consonant
        