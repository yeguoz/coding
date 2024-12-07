import java.util.Arrays;

public class arrayMerge {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        merge2(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int item : nums2) {
            nums1[m] = item;
            m++;
        }
        // Bubble sort
        for (int i=0; i < nums1.length; i++) {
            for (int j=0; j<nums1.length-i-1; j++) {
                if (nums1[j]>nums1[j+1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
        System.out.println("merge1:"+Arrays.toString(nums1));
    }
    //  efficient solution
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        // i nums1最后索引，j nums2最后索引，k nums1合并后最后索引
        int i = m - 1, j = n - 1, k = m + n - 1;
        // 从右往左处理数据
        while (i >= 0 && j >= 0) {
            // 两个数组是递增数组，从后往前比较，
            // 如果nums1[i] >= nums2[j]，则nums1[i]放到nums1[k]的位置，i--，k--，
            // 否则nums2[j]放到nums1[k]的位置，j--，k--
            nums1[k--] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
        }
        // 如果nums2数组还有剩余，则将剩余数据放到nums1数组的前面，
        // 结果放入nums1数组中 如果nums1有剩余不用处理
        if (j >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, j + 1);
        }
        System.out.println("merge2:"+ Arrays.toString(nums1));
    }
}
