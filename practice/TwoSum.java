import java.util.Arrays;
import java.util.HashMap;

/**
 * 题目：两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * 你可以按任意顺序返回答案。
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        int[] result1 = twoSum(nums1, target1);
        int[] result2 = twoSum(nums2, target2);
        int[] result3 = twoSum(nums3, target3);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
        System.out.println("==================");
        int[] result4 = twoSumHash(nums1, target1);
        int[] result5 = twoSumHash(nums2, target2);
        int[] result6 = twoSumHash(nums3, target3);
        System.out.println(Arrays.toString(result4));
        System.out.println(Arrays.toString(result5));
        System.out.println(Arrays.toString(result6));
    }
    // hash表 时间复杂度O(n)
    public static int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // key 为数组元素，value 为数组索引
            int complement = target - nums[i];
            // 最新遍历的元素的补数 都只和 之间添加map中元素 进行equal判断，只需遍历一次数组
            if (hashMap.containsKey(complement))
                return new int[] {hashMap.get(complement),i};
            hashMap.put(nums[i],i);
        }
        return null;
    }

    // 时间复杂度O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


}
