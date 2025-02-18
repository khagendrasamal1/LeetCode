class Solution {
    public String smallestNumber(String pattern) {
        int size = pattern.length() + 1;

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<pattern.length(); i++){
            int temp = i;

            while(temp < pattern.length() && pattern.charAt(temp) == 'D'){
                temp++;
            }

            reverse(arr, i, temp);

            if(temp != i)   i = temp-1; 
        }

        return Arrays.toString(arr).replaceAll("\\[|\\]|, |\\s", "");
    }

    public void reverse(int arr[], int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}