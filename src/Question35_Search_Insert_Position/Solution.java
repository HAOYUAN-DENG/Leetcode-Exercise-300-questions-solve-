package Question35_Search_Insert_Position;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target);
    }


    public static int binarySearch(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        // when number are indeed in the array
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

        // when number are not in array, not found
        return i;
    }

//    public static void main(String[] args) {
//        int[] nums = {1,3,5,6};
//        int target = 2;
//
//        int result = search(nums, target);
//        System.out.println(result);
//    }

}


