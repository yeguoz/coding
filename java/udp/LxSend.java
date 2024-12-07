package udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class LxSend {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入您想说的话：");
            String str = sc.nextLine();
            if ("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress ia = InetAddress.getByName("127.0.0.1");
            int port = 8880;

            DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length,ia,port);
            ds.send(dp);


        }
        ds.close();
    }
}
