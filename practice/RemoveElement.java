import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result);
    }
    public static int removeElement(int[] nums, int val) {
        int j = 0; // 指针 j 用于存储结果
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i]; // 将非 val 元素移到前面
                j++; // 更新 j 的位置
            }
        }
        System.out.println(Arrays.toString(nums));
        return j; // 返回不等于 val 的元素数量
    }
}
