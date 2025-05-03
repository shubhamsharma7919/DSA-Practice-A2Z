class secondLargestElement {
    public int secondLargestElement(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secMax = max;
                max = nums[i];
            } else if (nums[i] > secMax && nums[i] != max) {
                secMax = nums[i];
            }
        }

        if (secMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found (all elements may be equal)");
        }

        return secMax;
    }
}
