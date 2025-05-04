class RotateArrayForK {
    public void swap(int left, int right, int[] arr) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        swap(0, nums.length - 1, nums);
        swap(0, k-1, nums);
        swap(k, nums.length - 1, nums);
        
    }
}