package BufferedIOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\aaa\\writer.txt",
                Charset.forName("GBk"));
        FileWriter fw = new FileWriter("F:\\aaa\\copyWriter.txt",
                Charset.forName("UTF-8"));
        int read;
        while ((read = fr.read())!=-1){

            fw.write((char)read);
        }
        fw.close();
        fr.close();
    }
}
