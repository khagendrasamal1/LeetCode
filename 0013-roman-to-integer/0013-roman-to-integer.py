class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman_map = {
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }

        n = len(s)
        total = 0

        for i in range(n):
            curr_val = roman_map[s[i]]

            if i+1 < n and curr_val < roman_map[s[i+1]]:
                total -= curr_val
            else:
                total += curr_val

        return total
        