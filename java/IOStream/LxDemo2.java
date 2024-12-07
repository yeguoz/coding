package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LxDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aaa\\ency.jpg");
        FileOutputStream fos = new FileOutputStream("F:\\aaa\\de.jpg");
        int read;
        while ((read = fis.read())!=-1) {
            fos.write(read ^ 2);
        }
        fos.close();
        fis.close();

    }
}
