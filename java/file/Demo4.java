package file;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("F:\\aaa\\c.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);

        File f2 = new File("F:\\aaa\\ddd");
        System.out.println(f2.mkdir());
        File f3 = new File("F:\\aaa\\ddd\\aa\\bb");
        System.out.println(f3.mkdirs());
    }
}
