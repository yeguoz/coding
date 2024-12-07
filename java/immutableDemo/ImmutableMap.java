package immutableDemo;

import java.util.Map;
import java.util.Set;

public class ImmutableMap {
    public static void main(String[] args) {

        Map<Integer, String> map = Map.of(1, "王五", 2, "张三", 3, "赵六");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        map.put(1,"王五");
    }
}
