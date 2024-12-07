package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Work3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "凤国贤", "滕欣源", "廉益冉", "贺雨泽", "陶雄霖", "孙国贤",
                "施甜", "韦雅晗", "马萌", "陶语晨");
        ArrayList<String> temp = new ArrayList<>();
        Random r = new Random();

        for (int i = 1; i <= 10; i++) {
            temp.addAll(list);
            Collections.shuffle(temp);
            System.out.println("===========第" + i + "轮================");
            while (temp.size() != 0) {
                int index = r.nextInt(temp.size());
                String name = temp.remove(index);
                System.out.println(name);
            }

        }


    }
}
