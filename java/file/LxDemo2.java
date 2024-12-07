package file;

import java.io.File;

public class LxDemo2 {
    public static void main(String[] args) {
        File f = new File("F:\\aaa");
        File[] files = f.listFiles();
        for (File file : files) {
           if (file.getName().endsWith(".avi"))
               System.out.println(file);
        }


    }
}
