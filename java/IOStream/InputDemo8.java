package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputDemo8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\shaonvlingyu\\video\\otome_op.wmv");
        FileOutputStream fos = new FileOutputStream("F:\\aaa\\test.wmv");
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while ((len=fis.read(bytes))!=-1) {
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
