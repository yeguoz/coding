import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * <p>
 * 示例 1：
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * <p>
 * 示例 2：
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 */

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int i = longestConsecutive(nums1);
        int j = longestConsecutive(nums2);
        System.out.println(i);
        System.out.println(j);
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        // 数组去重
        for (int num : nums) {
            hashSet.add(num);
        }
        int longestSequence = 0;

        for (int num : hashSet) {
            // 不包含小于自己的元素，所以是开头元素（或者结尾元素）
            // 这两种(选一种方式)只需要计算从他们开始的序列，不需要计算其他的，较少了时间开支
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;
                while (hashSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }
        return longestSequence;
    }
}


















