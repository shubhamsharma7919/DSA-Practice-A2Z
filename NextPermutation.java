class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int blueGola = -1;

        for (int i = n-1;i>0;i--) {
            if (nums[i] > nums[i-1]) {
                blueGola = i-1;
                break;
            }
        }
        if (blueGola != -1) {
            for(int j = n-1;j>blueGola;j--) {
                if (nums[j] > nums[blueGola]) {
                    swap (nums, j, blueGola);
                    break;
                }
            }
            reverse (nums, blueGola + 1, n-1);
        } else {
            reverse(nums, 0, n-1);
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap (nums, i, j);
            i++;
            j--;
        }
    }    
}