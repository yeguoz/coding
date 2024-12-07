package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\aaa\\a.txt");
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
        byte[] bytes = {97,98,99,100,101,102};
//        fos.write(bytes);
        fos.write(bytes,2,3);
        fos.close();
    }
}
