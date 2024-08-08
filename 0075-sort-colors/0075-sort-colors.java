class Solution {
    public void sortColors(int[] nums) {
        int numZeroes = 0;
        int numOnes = 0;
        int numTwos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numZeroes++;
            } else if (nums[i] == 1) {
                numOnes++;
            } else {
                numTwos++;
            }
        }

        for (int i = 0; i < numZeroes; i++) {
            nums[i] = 0;
        }
        for (int i = numZeroes; i < numZeroes + numOnes; i++) {
            nums[i] = 1;
        }
        for (int i = numZeroes + numOnes; i < numZeroes + numOnes + numTwos; i++) {
            nums[i] = 2;
        }
        }
    }

