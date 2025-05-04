import java.util.*;

class UnionArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> res = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                addIfNotDuplicate(res, nums1[i]);
                i++;
            } else if (nums2[j] < nums1[i]) {
                addIfNotDuplicate(res, nums2[j]);
                j++;
            } else {
                addIfNotDuplicate(res, nums1[i]);
                i++;
                j++;
            }
        }

        while (i < nums1.length) {
            addIfNotDuplicate(res, nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            addIfNotDuplicate(res, nums2[j]);
            j++;
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private void addIfNotDuplicate(List<Integer> res, int val) {
        if (res.isEmpty() || res.get(res.size() - 1) != val) {
            res.add(val);
        }
    }
}
