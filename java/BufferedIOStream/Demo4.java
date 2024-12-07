package BufferedIOStream;

import java.io.*;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aaa\\newCsb.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
