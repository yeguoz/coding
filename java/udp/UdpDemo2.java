package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;

public class UdpDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        ds.receive(dp);

        byte[] data = dp.getData();
        InetAddress address = dp.getAddress();
        int length = dp.getLength();
        int port = dp.getPort();
        SocketAddress socketAddress = dp.getSocketAddress();

        System.out.println("数据是"+new String(data,0,length));
        System.out.println("地址是"+address);
        System.out.println("长度是"+length);
        System.out.println("端口号是"+port);
        System.out.println("socketAddress是"+socketAddress);



    }
}
