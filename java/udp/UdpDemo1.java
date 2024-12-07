package udp;

import java.io.IOException;
import java.net.*;

public class UdpDemo1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String str = "你好";
        byte[] bytes = str.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,
                 InetAddress.getByName("127.0.0.1"),10086);
        ds.send(dp);
        ds.close();
    }
}
