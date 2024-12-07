package zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("F:\\aaa\\bbb.zip");
        File dest = new File("F:\\aaa\\dest");
        unZip(src,dest);


    }
    public static void unZip(File src,File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry=zip.getNextEntry())!=null){
            if (entry.isDirectory()){
                //如果是目录就创建目录
                File dir = new File(dest, entry.toString());
                dir.mkdirs();
            }else {
                //如果是文件就写入对应目录结构文件中
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                byte[] bytes = new byte[1024*5];
                int len;
                while ((len=zip.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }

    public static void test(File src,File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry=zip.getNextEntry())!=null){
            if (entry.isDirectory()){
                //如果是目录就创建目录
                File dir = new File(dest, entry.toString());
                dir.mkdirs();
            }
        }

    }
}
