class Solution {

    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int arr[], int low, int high){
        int pivotIndex = low + (int) (Math.random() * (high - low + 1));
        swap(arr, pivotIndex, high);
        
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pivotIdx = partition(arr, low, high);

            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        quickSort(nums, 0, n-1);

        return nums;
    }
}