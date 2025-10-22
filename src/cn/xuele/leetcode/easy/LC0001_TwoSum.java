package cn.xuele.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 0001 <a href="https://leetcode.cn/problems/two-sum/">Two Sum</a>
 * 给定一个整数数组 nums 和一个整数 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 *
 * @author XueLe
 * @since 2025-10-22
 */
public class LC0001_TwoSum {

    //Time  O(n)
    //Space O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new LC0001_TwoSum().twoSum(nums, target)));
    }
}
