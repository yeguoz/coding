import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int i = majorityElement2(nums);
        int i2 = majorityElement2(nums2);
        System.out.println(i);
        System.out.println(i2);
    }

    //Boyer-Moore 投票算法
    public static int majorityElement2(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            }else {
                count--;
            }

            if (count ==0){
                candidate = nums[i];
                count = 1;
            }
        }
        return candidate;
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        HashSet<Map.Entry<Integer, Integer>> entries = new HashSet<>(hm.entrySet());
        for (HashMap.Entry<Integer, Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > nums.length / 2)
                result = key;
        }
        return result;
    }

}
