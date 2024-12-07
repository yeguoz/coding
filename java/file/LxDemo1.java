package file;

import java.io.File;
import java.io.IOException;

public class LxDemo1 {
    public static void main(String[] args) throws IOException {
        File f = new File("F:\\aaa\\a.txt");
        boolean newFile = f.createNewFile();
        System.out.println(newFile);



    }
}
