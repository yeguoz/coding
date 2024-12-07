package file;

import java.io.File;
import java.io.IOException;

public class lxGj {
    public static void main(String[] args) throws IOException {

        File f = new File("aaa");
        f.mkdirs();
        File f2 = new File(f, "a.txt");
        boolean newFile = f2.createNewFile();

        System.out.println(f2.getAbsolutePath());

    }
}
