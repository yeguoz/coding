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

    /**
     * 找出从每一个字符开始的，不包含重复字符的最长子串,从每个字符开始的字串长度，记录相比较最大的值，
     * 当遇到重复字符，切换开始字符(start++)，因为从原start开始到end-1，都是连续的，所以原start-end-1长度必定小于之前记录
     * 所以不需要记录长度，如果start++后还是有重复的字符，继续start++直到没有重复字符开始进行计算字串长度。
     * @param s 源字符串
     * @return 最长字串长度
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            // start位置字符和新加入的字符不同，需要将start位置设置到不相同的位置，
            // 中间位置因为是原字串是连续的长度可以不记录(原字符串肯定是最长的)
            // 从最新的不包含的当前字符的位置开始记录新的串，计算更大的串长度
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
