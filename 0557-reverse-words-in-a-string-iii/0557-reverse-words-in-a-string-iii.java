class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();

        int n = arr.length;

        int i = 0;

        for(int j=0; j<=n; j++){
            if(j == n || arr[j] == ' '){
                reverse(arr, i, j-1);
                i = j+1;
            }
        }
        return new String(arr);
    }

    public void reverse(char arr[], int i, int j){
        
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }    
    }
}