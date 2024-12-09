import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicates(nums);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
        
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        int k = 1;
        while (j < nums.length) {
            if (nums[j] > nums[i]) {
                i = j;
                nums[k] = nums[j];
                k++; // 计算不同元素个数
            }
            while (nums[i] == nums[j]) {
                j++;
                if (j > nums.length - 1) break;
            }
        }
        return k;
    }
    //  efficient solution
    public static int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // 空数组的情况
        }
        int k = 1; // 慢指针，指向下一个存储位置
        // 从第二个元素开始扫描数组
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[k - 1]) { // 当前元素和上一个唯一元素不相等
                nums[k] = nums[j]; // 存储到下一位置
                k++;
            }
        }
        return k; // 返回唯一元素的数量
    }
}