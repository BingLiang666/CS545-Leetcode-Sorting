public class Solutions {

    /* Problem 75. #sortColors# #MEDIUM#
     * https://leetcode.com/problems/sort-colors/
     *  Problem description:
     *  Given an array nums with n objects colored red, white, or blue,
     *  sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
     *  We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     *  You must solve this problem without using the library's sort function.
     */
    public static void sortColors(int[] nums) {
        int count0 = 0;   // store the number of 0 in count0
        int count1 = 0;   // store the number of 1 in count1
        int count2 = 0;   // store the number of 2 in count2
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0: count0++;
                        break;
                case 1: count1++;
                        break;
                case 2: count2++;
                        break;
                default: break;
            }
        }
        int index = 0;          // keep track of the current element in array nums
        while(count0 > 0) {     // place certain number of 0, 1 and 2 in the array nums
            nums[index++] = 0;
            count0--;
        }
        while(count1 > 0) {
            nums[index++] = 1;
            count1--;
        }
        while(count2 > 0) {
            nums[index++] = 2;
            count2--;
        }
    }

    /* Problem 912. #Sort an Array# #MEDIUM#
     * Given an array of integers nums, sort the array in ascending order.
     */
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        mergeChunks(nums, low, high);
    }

    public static void mergeChunks(int[] nums, int low, int high) {
        int[] res = new int[high - low + 1];
        int mid = (low + high) / 2;
        int i = low;
        int j = mid + 1;
        int index = 0;
        while(i <= mid || j <= high) {
            if (i > mid) {      // There is no more elements in the first chunk, but the second chunk still has element/elements
                res[index++] = nums[j++];
            } else if (j > high) {   // There is no more elements in the second chunk, but the first chunk still has element/elements
                res[index++] = nums[i++];
            } else {
                if (nums[i] < nums[j]) {
                    res[index++] = nums[i++];
                } else {
                    res[index++] = nums[j++];
                }
            }
        }
        int pos = 0;
        for (int k = low; k <= high; k++) {
            nums[k] = res[pos++];
        }
    }
}
