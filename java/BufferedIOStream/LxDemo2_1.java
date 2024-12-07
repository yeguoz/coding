package BufferedIOStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LxDemo2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\aaa\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\aaa\\newCsb2.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine())!=null){
            list.add(line);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1Str = o1.split("\\.")[0];
                String o2Str = o2.split("\\.")[0];
                int i1 = Integer.parseInt(o1Str);
                int i2 = Integer.parseInt(o2Str);
                return i1-i2;
            }
        });
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        br.close();

    }
}
