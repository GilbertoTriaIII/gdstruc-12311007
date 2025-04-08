public class Main {
    public static void main(String[] args) {
        int[] nums = {-100, -50, -12, 5, 16, 42, 55, 100};

        int searchValue = -12;
        int index = BinarySearch(nums, searchValue);
        System.out.println(searchValue + " is in index " + index);

    }

    private static int LinearSearch(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (value == nums[i]) {
                return i;
            }
        }
        return -1;
    }
  
    private static int BinarySearch(int[] nums, int value) {
        int start = 0;
        int end = nums.length - 1;

        while (start == end) {
            int middle = (start + end) / 2;

            if (value == nums[middle]) {
                return middle;
            }
            else if (value < nums[middle]) {
                end = middle - 1;
            }
            else if (value > nums[middle]) {

            }
        }
    }
}
