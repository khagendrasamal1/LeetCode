class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        freq = {}

        for word in words:
            freq[word] = freq.get(word, 0)+1

        unique_words = list(freq.keys())

        unique_words.sort(key=lambda w: (-freq[w], w))

        return unique_words[:k]