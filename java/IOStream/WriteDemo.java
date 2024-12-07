package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\aaa\\b.txt",true);
        fw.write("你好哇，喜喜");
        fw.close();
    }
}
