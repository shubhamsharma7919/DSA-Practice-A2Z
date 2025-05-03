public class RecursiveBubbleSort {

    // Recursive function to perform bubble sort
    public static void bubbleSort(int[] arr, int n) {
        
        if (n==1) {
            return;
        }
        for (int i=0;i<n-1;i++) {
             if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
             }
        }
        bubbleSort(arr, n-1); 
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr, arr.length);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
