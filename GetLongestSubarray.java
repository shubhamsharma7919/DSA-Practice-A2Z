
public class GetLongestSubarray {
    public static int getLongestSubarray(int []a, long k) {
        int len = 0;
        
        for (int i =0;i<a.length;i++ ) {
             long s = 0;
             for (int j=i;j<a.length;j++) {
                s += a[j];
                if (s == k) {
                    len = Math.max(len, j - i + 1);
                }
             }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}