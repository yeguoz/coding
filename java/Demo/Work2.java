package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Work2 {
    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Random r = new Random();
        int index = r.nextInt(list.size());
        Collections.shuffle(list);
        int num = list.get(index);
        System.out.println(num);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"孙清妍","余嘉怡","葛欣源","奚欣源","时杨","范袁艺","朱春齐");
        Collections.addAll(girlList,"廉佳怡","金天昊","杨淑华","方添昊","周雅晗","许东东","余佳欣");
        if (num == 1) {
           int i = r.nextInt(boyList.size());
           String boyName = boyList.get(i);
           System.out.println(boyName);
        }else if (num == 0) {
            int j = r.nextInt(girlList.size());
            String girlName = girlList.get(j);
            System.out.println(girlName);
        }

    }
}
