package BufferedIOStream;

import java.io.*;

public class BufferedInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\aaa\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\aaa\\copy.txt"));
        int read;
        while ((read =bis.read())!=-1){
            bos.write(read);
        }
        bos.close();
         bis.close();

    }

}
