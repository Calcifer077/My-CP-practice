package leetcode;

public class remove_duplicates {
    public static int removeDuplicates(int[] nums) {

        int j = 0;
        nums[j] = nums[0];
        j++;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                //
            } else {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        return j;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }
}