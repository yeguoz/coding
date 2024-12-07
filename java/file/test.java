package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        File f = new File("F:\\作业");
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
                    String[] sp = file.getName().split("\\.");
                    String key = sp[sp.length-1];
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
}
