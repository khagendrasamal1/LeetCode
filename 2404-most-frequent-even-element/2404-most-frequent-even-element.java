class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            if (num % 2 == 0) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        int mostFrequentEven = -1;
        int maxFrequency = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int evenNum = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency || (frequency == maxFrequency && evenNum < mostFrequentEven)) {
                mostFrequentEven = evenNum;
                maxFrequency = frequency;
            }
        }
        
        return mostFrequentEven;
    }
}