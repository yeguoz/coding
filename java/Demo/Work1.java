package Demo;

import java.util.ArrayList;
import java.util.Collections;

public class Work1 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        Collections.addAll(list,"柏佳怡","韦鑫鑫","魏雨泽","袁伟洋","柳美欣","卞清妍");
//        Random r = new Random();
//        int i = r.nextInt(list.size());
//        System.out.println(list.get(i));
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
