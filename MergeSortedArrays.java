import java.util.Arrays;
public class MergeSortedArrays {
    public static int[] mergeArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
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
      return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

}