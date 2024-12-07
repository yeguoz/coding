package immutableDemo;

import java.util.List;

public class listDemo {
    public static void main(String[] args) {

        // list不可变集合
        List<String> list = List.of("张三","里斯","王五","赵六");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
