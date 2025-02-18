public class Module0 {
    public static void main(String[] args) {
        int[] nums = new int[5];

        nums[0] = 14;
        nums[1] = -5;
        nums[2] = 23;
        nums[3] = 19;
        nums[4] = 1;

        int value = 19;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                index = 1;
                break;
            }
        }

        System.out.println(String.valueOf(value) + " is in index " + String.valueOf(index));
    }
}

public class Module0 {
    public static void main(String[] args) {
        int[] nums = new int[5];

        nums[0] = 14;
        nums[1] = -5;
        nums[2] = 23;
        nums[3] = 19;
        nums[4] = 1;

        int value = 19;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                index = i;
                break;
            }
        }

        System.out.println(String.valueOf(value) + " is in index " + String.valueOf(index));
    }
}

