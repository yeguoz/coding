import java.util.*;

/**
 * 题目：字母异位词分组
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * <p>
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 输入: strs = [""]
 * 输出: [[""]]
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 */
public class GroupAnagrams {
    public static void main(String[] args)  {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};

        List<List<String>> lists1 = groupAnagrams2(strs1);
        List<List<String>> lists2 = groupAnagrams2(strs2);
        List<List<String>> lists3 = groupAnagrams2(strs3);

        System.out.println(lists1);
        System.out.println(lists2);
        System.out.println(lists3);
    }
    // O(n*k)
    public static List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] charCount = new int[26];
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append('#').append(count);
            }
            String key = keyBuilder.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
    //O(n*k log k)
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();     // 转为char[] 对其排序
            Arrays.sort(charArray);
            String key = Arrays.toString(charArray); // 排序后转str
            if (!hashMap.containsKey(key)) {         // str为key，不存在则put value为ArrayList
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(str);               // 存在这个key 将该单词加入Arraylist
        }
        return new ArrayList<>(hashMap.values());
    }
}
