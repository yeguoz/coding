import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(nums);
        int result2 = removeDuplicates(nums2);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
        System.out.println(result2);
        System.out.println(Arrays.toString(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        int slow = 2; // 允许两个相同 所有前两个元素无论如何都是符合条件
        for (int fast=2; fast < nums.length; fast++) {
            if (nums[fast]!=nums[slow-2]){  // 和前一个的前一个比较相同
                nums[slow] = nums[fast];    // 说明是相同的第三个元素 不需要处理slow,
                slow++;                     // fast循环（如果还相同说明是相同第四个元素 类推）;
            }                               // 不相等的话说明slow--fast中间位置 说明都是相同的元素
        }                                   // 更新slow索引的元素为nums[fast]，slow++
        return slow;                        // slow为索引 每次处理完后slow++ 最后结束 正好是条件的数组长度
    }
}
