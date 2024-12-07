package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aaa\\a.txt");
        while (true) {
            int read = fis.read();
            if (read == -1)
                break;
            System.out.print((char)read);
        }

        fis.close();

    }
}
