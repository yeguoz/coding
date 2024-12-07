package tcp.lxDemo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8800);
        // 监听
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        // 转换字符输入流
        InputStreamReader isr = new InputStreamReader(is);

        int read;
        while ((read = isr.read())!=1){
            System.out.print(read);
        }


        socket.close();
//        ss.close();


    }
}
