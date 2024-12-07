package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LxDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("F:\\aaa\\bbb");
        File dest = new File("F:\\aaa\\dest");
        copyDir(src,dest);

    }
    public static void copyDir(File src,File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                // 如果是文件就将文件拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes))!=-1) {
                    fos.write(bytes,0,len);
                }

            }else {
                // 是文件夹就遍历
                copyDir(file,new File(dest,file.getName()));

            }

        }

    }

}

