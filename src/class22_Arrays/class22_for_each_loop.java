package class22_Arrays;

public class class22_for_each_loop {
    public static void main(String[] args) {
        int[] nums = {12, 54, 56, 84, 12};

        for (int num : nums) {
            System.out.println(num);
        }
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num >= max) {
                max = num;
            }
            if (num <= num) {
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);

        String[] arr = {"cat", "dog", "horse" };
        for (String str : arr) {
            if (!str.equals("horse")) {
                System.out.println(str);
            }
        }
    }
}
