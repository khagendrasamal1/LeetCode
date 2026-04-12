class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        freq = [0]*26

        for ch in s:
            freq[ord(ch)-ord('a')] += 1 

        for ch in t:
            freq[ord(ch)-ord('a')] -= 1
        
        for num in freq:
            if num != 0:
                return False
        
        return True