package leetcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcodeThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i != j && i != k && j != k && (nums[i] + nums[j] + nums[k]) == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}
