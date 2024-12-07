package PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintSteamDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("F:\\aaa\\b.txt"),true, Charset.forName("UTF-8"));
        ps.println("哈哈");
        ps.println();
        ps.printf("%s 爱上了 %s","阿珍","阿强");
        ps.close();
    }
}
