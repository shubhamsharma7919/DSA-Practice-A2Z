public class Insertion_sort {

    // Function to perform Insertion Sort
    public static void insertionSort(int[] arr) {
          for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; 
            int j = 0;
        
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j]; 
                } else {
                    break; 
                }
            }
            arr[j + 1] = key;
          }
        }
    

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the Insertion Sort
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};  // Example array
        System.out.println("Original array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
