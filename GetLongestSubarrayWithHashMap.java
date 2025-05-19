import java.util.*;
class GetLongestSubarrayWithHashMap {
    public int longestSubarrayWithSumK(int[] nums, int k) {
       Map <Integer, Integer> prefixSumMap = new HashMap<>();
       int sum = 0;
       int maxLen = 0;
       for(int i=0;i<nums.length;i++) {
          sum += nums[i];

          if (sum == k) {
            maxLen = i+1;
          }
          if (prefixSumMap.containsKey(sum - k)) {
              int prevIndex = prefixSumMap.get(sum - k);
              maxLen = Math.max(maxLen, i - prevIndex);
          }
          if (!prefixSumMap.containsKey(sum)) {
              prefixSumMap.put(sum, i);
          }
       }
       return maxLen;
    }

    public static void main(String[] args) {
        GetLongestSubarrayWithHashMap solution = new GetLongestSubarrayWithHashMap();

        // Example input
        int[] nums = {2, -1, 2, 3, -2, 4};
        int k = 4;

        int result = solution.longestSubarrayWithSumK(nums, k);
        System.out.println("Longest subarray length with sum " + k + ": " + result);
    }
}
