
import java.util.Arrays;
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        twoSum obj = new twoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 26;
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }
}