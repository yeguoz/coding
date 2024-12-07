package file;

import java.io.File;

public class Demo6 {
    public static void main(String[] args) {

        File f1 = new File("F:\\aaa");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
