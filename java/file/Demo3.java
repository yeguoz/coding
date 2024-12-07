package file;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        File f1 = new File("F:\\aaa\\aaa.txt");
        System.out.println(f1.length());
        File f2 = new File("F:\\aaa\\c");
        System.out.println(f2.length());

        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getName());

        System.out.println(f2.getPath());


        System.out.println(f1.lastModified());
    }
}
