package PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteDemo1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("F:\\aaa\\b.txt"),true);
        pw.println("相信法律亏大发了萨芬");
        pw.println();
        pw.println("阿珍爱上了阿强");
        pw.close();

    }
}
