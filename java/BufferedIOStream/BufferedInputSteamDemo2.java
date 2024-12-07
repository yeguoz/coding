package BufferedIOStream;

import java.io.*;

public class BufferedInputSteamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\aaa\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\aaa\\copy2.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();



    }
}
