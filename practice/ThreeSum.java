import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目： 三数之和
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
 * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * 示例 1.
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 解释：
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 * 示例 2.
 * 输入：nums = [0,1,1]
 * 输出：[]
 * 解释：唯一可能的三元组和不为 0 。
 * 示例 3.
 * 输入：nums = [0,0,0]
 * 输出：[[0,0,0]]
 * 解释：唯一可能的三元组和为 0 。
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 1, 1};
        int[] nums3 = {0, 0, 0};
        int[] nums4 = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        List<List<Integer>> lists1 = threeSum(nums1);
        List<List<Integer>> lists2 = threeSum(nums2);
        List<List<Integer>> lists3 = threeSum(nums3);
        List<List<Integer>> lists4 = threeSum(nums4);
        System.out.println(lists1);
        System.out.println(lists2);
        System.out.println(lists3);
        System.out.println(lists4);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;
        // 排序，包含正负元素的数组左部分为负 右部分为正
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // i>0 寿命 i==0 nums[i]!=0排除全是0情况，nums[i]>0时说明后面都为整数没有继续遍历的必要
            if (i > 0 && nums[i] > 0) break;
            // 当前遍历元素如果和上一个遍历的元素相等 continue防止重复
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;    // 二重遍历时候跳过重复的元素
                    while (left < right && nums[right] == nums[right - 1]) right--; // 二重遍历时候跳过重复的元素
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
