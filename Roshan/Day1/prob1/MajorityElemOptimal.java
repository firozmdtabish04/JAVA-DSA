package Day1.prob1;

public class MajorityElemOptimal {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1,1, 2, 2,4,4,2,2,2 };
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(candidate);
    }
}