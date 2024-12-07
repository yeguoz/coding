package file;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        File f1 = new File("F:\\aaa\\aaa.txt");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println("--------------------------------");
        File f2 = new File("F:\\aaa\\bbb");
        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println("--------------------------------");

        File f3 = new File("F:\\aaa\\ccc");
        System.out.println(f3.exists());
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
    }
}
