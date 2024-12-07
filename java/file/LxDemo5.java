package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LxDemo5 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Lenovo\\Downloads");
        printExtensionCount(f);


    }

    private static void printExtensionCount(File f) {
        HashMap<String,Integer> hm = new HashMap<>();
        getFiles(f,hm);
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+" : "+value);
        }
    }

    private static void getFiles(File src,HashMap hm) {
        File[] files = src.listFiles();
        if (files!=null){
            for (File file : files) {
                if (file.isDirectory()){
                    getFiles(file,hm);
                }else {
                    String key = getExtension(file.getName());
                    if (hm.containsKey(key)){
                        Integer value = (Integer) hm.get(key);
                        value += 1;
                        hm.put(key,value);
                    }else {
                        hm.put(key,1);
                    }
                }
            }
        }
    }
    public static String getExtension(String str){
        for (int i = str.length()-1; i >= 0 ; i--) {
            char c = str.charAt(i);
            if (c=='.'){
                return str.substring(i+1);
            }
        }
        return null;
    }


}
