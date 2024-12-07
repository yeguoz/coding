package file;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        String path = "D:\\a.txt";
        File f1 = new File(path);
        System.out.println(f1);

        String parent = "D:\\a";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File f3 = new File("D:\\b");
        String child2 = "b.txt";
        File f4 = new File(f3, child2);
        System.out.println(f4);
    }
}
