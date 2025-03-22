import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] res, int[] a, int[] b) {
       
        int i=0;
        int j=0;
        int k=0;
      while (i<a.length && j<b.length) {
        if (a[i] < b[j]) {
            res[k] = a[i];
            i++;
            k++;
        } else {
            res[k] = b[j];
            j++;
            k++;
        }
      }
      while (i < a.length) {
        res[k] = a[i];
        i++;
        k++;
      }
      while (j < b.length) {
        res[k] = b[j];
        j++;
        k++;
      }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length/2;

         int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);

    }

    // Main method to test the Merge Sort
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

}