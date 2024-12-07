package tcp.lxDemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8800);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if ("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes();
            os.write(bytes);
        }

        socket.close();


    }
}
