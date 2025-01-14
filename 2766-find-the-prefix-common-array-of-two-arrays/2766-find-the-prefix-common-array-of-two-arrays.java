class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int C[] = new int[n]; 

        int freq[] = new int[n+1];
        int cnt = 0;

        for(int i=0; i<n; i++){
            freq[A[i]]++;
            if(freq[A[i]] == 2) cnt++;

            freq[B[i]]++;
            if(freq[B[i]] == 2) cnt++;

            C[i] = cnt;
        }
        return C;
    }
}