
class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1; // Index for placing next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j; // Number of unique elements
    }

    public static void main(String[] args) {
        RemoveDuplicate sol = new RemoveDuplicate();

        int[] nums = {1, 1, 2, 2, 3};
        int k = sol.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
