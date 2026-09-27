package Day1.prob3;

import java.util.*;

public class MajorityElement2Better {

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                ans.add(key);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 2, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}
