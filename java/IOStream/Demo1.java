package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("F:\\aaa\\a.txt");
        fos.write(97);
        fos.close();

    }
}
