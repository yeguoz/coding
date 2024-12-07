package file;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        File f1 = new File("F:\\aaa\\bbb");
        System.out.println(f1.delete());

        File f2 = new File("F:\\aaa\\c.txt");
        System.out.println(f2.delete());

    }
}
