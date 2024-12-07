package BufferedIOStream;

import java.io.*;
import java.util.Set;
import java.util.TreeMap;

public class LxDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\aaa\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\aaa\\newCsb.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while ((line = br.readLine())!=null){
            String startStr = line.split("\\.")[0];
            int index = Integer.parseInt(startStr);
            tm.put(index,line);
        }
        Set<Integer> integers = tm.keySet();
        for (Integer integer : integers) {
            String value = tm.get(integer);
            bw.write(value);
            bw.newLine();
        }


        bw.close();
        br.close();





    }
}
