package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aaa\\a.txt");
        byte[] bytes = new byte[100];
        int len = fis.read(bytes);
        String str = new String(bytes,0,len);
        System.out.println(str);

        fis.close();
    }
}
