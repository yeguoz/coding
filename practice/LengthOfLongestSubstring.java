import java.util.HashSet;
import java.util.Set;

/**
 * 题目：无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        int i = lengthOfLongestSubstring(s1);
        int i1 = lengthOfLongestSubstring(s2);
        int i2 = lengthOfLongestSubstring(s3);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
