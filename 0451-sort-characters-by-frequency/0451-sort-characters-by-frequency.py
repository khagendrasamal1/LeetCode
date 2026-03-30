class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        freq = {}

        for char in s:
            freq[char] = freq.get(char, 0)+1

        def get_frequency(item):
            return item[1]

        sorted_items = sorted(freq.items(), key=get_frequency, reverse=True)

        result = []
        for char, cnt in sorted_items:
            result.append(char*cnt)

        return "".join(result)

        