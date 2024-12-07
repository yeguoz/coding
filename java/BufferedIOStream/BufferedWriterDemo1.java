package BufferedIOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\aaa\\bufferedWriter.txt"));
        bw.write("我是一个bufferedWriter");
        bw.newLine();
        bw.write("我是换行后的");
        bw.close();


    }
}
