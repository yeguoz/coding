package objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class LxDemo1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\aaa\\a.txt"));
        People s1 = new People("王五",23);
        People s2 = new People("里斯",26);
        People s3 = new People("赵六",15);
        ArrayList<People> list = new ArrayList<>();
        Collections.addAll(list,s1,s2,s3);
        oos.writeObject(list);
        oos.close();
    }
}
