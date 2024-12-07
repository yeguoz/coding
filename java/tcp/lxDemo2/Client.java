package tcp.lxDemo2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8800);
        // 输出流
        OutputStream os = socket.getOutputStream();
        // 写入数据
        String str = "见到你很高兴";
        byte[] bytes = str.getBytes();
        os.write(bytes);
        socket.shutdownOutput();

        // 关闭socket
        socket.close();


    }
}
