package Question704BinarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target);
    }


    public int binarySearch(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {

            int middleIndex = i + j >>> 1;
            if (nums[middleIndex] > target) {
                j = middleIndex - 1;

            } else if (nums[middleIndex] < target) {
                i = middleIndex + 1;

            } else {
                return middleIndex;
            }

        }

        return -1; // number do not exist in loop
    }


}

