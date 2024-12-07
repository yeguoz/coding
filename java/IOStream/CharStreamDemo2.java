package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\aaa\\a.txt");
        fw.write("wwww");
        fw.write("嘻嘻嘻");
        fw.flush();
        fw.write("flush后。。。。。");
        fw.flush();
        fw.close();
    }
}
