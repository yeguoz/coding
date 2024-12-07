package BufferedIOStream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\aaa\\csbGBK.txt",
                Charset.forName("GBK"));
        int read;
        while ((read = fr.read())!=-1){
            System.out.print((char)read);
        }
        fr.close();



    }
}
