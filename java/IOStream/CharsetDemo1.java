package IOStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharsetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str1 = "贾帅鹏";
        byte[] bytes1 = str1.getBytes();
        System.out.println(Arrays.toString(bytes1));

        String str2 = "贾帅鹏";
        byte[] bytes2 = str2.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        String s1 = new String(bytes1);
        System.out.println(s1);

        String gbk = new String(bytes1, "GBK");
        System.out.println(gbk);

        String utf = new String(bytes2);
        System.out.println(utf);

    }
}
