import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目：找到字符串中所有字母异位词
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的异位词
 * 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * 示例 1:
 * <p>
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 */
public class FindAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        String s1 = "abab";
        String p1 = "ab";
        List<Integer> anagrams = findAnagrams(s, p);
        List<Integer> anagrams1 = findAnagrams(s1, p1);
        System.out.println(anagrams);
        System.out.println(anagrams1);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;
        }
        // 记录字母频率
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        // 滑动串口记录字母频率
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            sCount[s.charAt(end) - 'a']++;
            // 窗口大于字串长度，将原窗口第一位的字母频率减小，缩小窗口(相当于移动了窗口)
            if (end - start + 1 > p.length()) {
                sCount[s.charAt(start) - 'a']--;
                start++;
            }
            // 窗口大小等于字串长度 并且 s串的字母频率和p串字母频率相同，说明是异位词，将该字串的起始位置假如list
            if (end - start + 1 == p.length() && Arrays.equals(sCount, pCount)) {
                list.add(start);
            }
        }
        return list;
    }
}
