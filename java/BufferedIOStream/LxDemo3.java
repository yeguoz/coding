package BufferedIOStream;

import java.io.*;

public class LxDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\aaa\\count.txt"));
        String s = br.readLine();
        br.close();
        int count = Integer.parseInt(s);
        count++;
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\aaa\\count.txt"));
        bw.write(count+"");
        bw.close();
        if (count <=3){
            System.out.println("您是第"+count+"使用免费");
        }else {
            System.out.println("您的免费次数已用完");
        }



    }
}
