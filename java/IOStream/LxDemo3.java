package IOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class LxDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\aaa\\a.txt");
        StringBuilder sb = new StringBuilder();
        int read;
        while ((read = fr.read())!=-1){
            sb.append((char)read);
        }
        fr.close();
        String str = sb.toString();
        String[] arrStr = str.split("-");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        String listStr = arrayList.toString();
        String replaced = listStr.replace(",", "-").replace("[","")
                .replace("]","");
        System.out.println(replaced);
        FileWriter fw = new FileWriter("F:\\aaa\\a.txt");
        fw.write(replaced);
        fw.close();



    }

}
