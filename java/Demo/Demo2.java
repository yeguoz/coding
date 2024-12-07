package Demo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"avd","dsd","sd","gg","ss");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
