package Question34;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        int[] indexDic = new int[]{i, j}; // initialized

        //Wrong case:no elements in nums list
        if (nums.length == 0) {
            i = -1;
            j = -1;
            return new int[]{i, j};
        }

        var leftResult = BinarySearchLeftMost(nums,target);
        var rightResult = binarySearchRightMost(nums,target);

        // Wrong case: element not exist in the nums list
        if (leftResult == -1 || rightResult == -1){
            i=-1;
            j=-1;
            indexDic[0] = i;
            indexDic[1] = j;
        }

        // Right case
        indexDic[0] = leftResult;
        indexDic[1] = rightResult;

        return indexDic;
    }

    public static int BinarySearchLeftMost(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        var candidateLeft = -1;

        while (i <= j) {
            var middleIndex = (i + j) >>> 1;
            if (target < nums[middleIndex]) {
                j = middleIndex - 1;
            } else if (target > nums[middleIndex]) {
                i = middleIndex + 1;
            } else {
                candidateLeft = middleIndex;
                j = middleIndex - 1;

            }
        }

        return candidateLeft;
    }

    public static int binarySearchRightMost(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        var candidateRight = -1;

        while (i <= j) {
            var middleIndex = (i + j) >>> 1;
            if (target < nums[middleIndex]) {
                j = middleIndex - 1;
            } else if (target > nums[middleIndex]) {
                i = middleIndex + 1;
            } else {
                candidateRight = middleIndex;
                i = middleIndex + 1;

            }
        }
        return candidateRight;
    }


}






