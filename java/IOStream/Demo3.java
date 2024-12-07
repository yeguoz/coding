package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\aaa\\a.txt",true);
        String str = "jsp hao shuai";
        byte[] bytes = str.getBytes();
        fos.write(bytes);


        String rn = "\r\n";
        byte[] bytes1 = rn.getBytes();
        fos.write(bytes1);

        String str1 = "666";
        byte[] bytes2 = str1.getBytes();
        fos.write(bytes2);

        fos.close();


    }
}
