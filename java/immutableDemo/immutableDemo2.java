package immutableDemo;

import java.util.Set;

public class immutableDemo2 {
    public static void main(String[] args) {

        Set<String> set = Set.of("王五","李瑞","朝气","乌苏","赵琦");
        for (String s : set) {
            System.out.println(s);

        }
        set.remove("王五");
    }
}
