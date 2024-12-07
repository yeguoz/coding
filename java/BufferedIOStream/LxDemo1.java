package BufferedIOStream;

import java.io.*;

public class LxDemo1 {
    public static void main(String[] args) throws IOException {
//        long l1 = byteBasicStream();
//        System.out.println("l1:" + l1);

        long l2 = byteBasicArrStream();
        System.out.println("l2:" + l2);

        long l3 = byteBufferedStream();
        System.out.println("l3:" + l3);

        long l4 = byteBufferedArrStream();
        System.out.println("l4:" + l4);
    }

    public static long byteBasicStream() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\VMware16.2.3\\xuniji\\CentOS-7-x86_64-DVD-2009.iso");
        FileOutputStream fos = new FileOutputStream("F:\\aaa\\lx1.iso");
        int read;
        while ((read = fis.read()) != -1) {
            fos.write(read);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long byteBasicArrStream() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\VMware16.2.3\\xuniji\\CentOS-7-x86_64-DVD-2009.iso");
        FileOutputStream fos = new FileOutputStream("F:\\aaa\\lx1_2.iso");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long byteBufferedStream() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\VMware16.2.3\\xuniji\\CentOS-7-x86_64-DVD-2009.iso"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\aaa\\Lx1_3.iso"));
        int read;
        while ((read = bis.read())!=-1){
            bos.write(read);
        }
        bos.close();
        bis.close();

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long byteBufferedArrStream() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\VMware16.2.3\\xuniji\\CentOS-7-x86_64-DVD-2009.iso"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\aaa\\Lx1_4.iso"));
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();

        long end = System.currentTimeMillis();
        return end - start;
    }
}
