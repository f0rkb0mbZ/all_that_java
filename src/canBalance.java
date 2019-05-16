import java.util.stream.IntStream;

public class canBalance {
    public static boolean canitBalance(int[] nums) {
//        int sum = IntStream.of(nums).sum();
        int sum = 0;
        for (int i : nums)
            sum += i;
        int currentsum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentsum += nums[i];
            if (currentsum == (sum - currentsum)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 1};
        System.out.println(canitBalance(arr));
    }
}
