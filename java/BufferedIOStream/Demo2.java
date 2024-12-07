package BufferedIOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\aaa\\writer.txt",
                Charset.forName("GBK"));
        fw.write("你好");
        fw.close();
    }
}
