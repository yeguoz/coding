package objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LxDemo1_1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\aaa\\a.txt"));
        ArrayList<People> list = (ArrayList<People>) ois.readObject();
        ois.close();
        for (People people : list) {
            System.out.println(people);
        }
    }
}
