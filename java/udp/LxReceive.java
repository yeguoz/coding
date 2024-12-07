package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class LxReceive {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(8880); byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes,0, bytes.length);

        while (true) {

            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
        }

    }
}
