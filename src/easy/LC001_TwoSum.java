package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target
 * 请你在该数组中找出 和为目标值 target  的那 两个 整数
 * 并返回它们的数组下标。
 */
public class LC001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
