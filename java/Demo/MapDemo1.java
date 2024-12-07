package Demo;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        /*
          江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
          湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
          河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
                                                    */

        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        Collections.addAll(city2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        Collections.addAll(city3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        hm.put("江苏省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();

        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringJoiner sj = new StringJoiner(", ", "", "");
            String key = entry.getKey();
            for (String city : entry.getValue()) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }


    }
}
