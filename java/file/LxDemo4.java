package file;

import java.io.File;

public class LxDemo4 {
    public static void main(String[] args) {
        File f = new File("F:\\aaa\\ccc");
        deleteFile(f);
    }
    public static void deleteFile(File src){
        // 将目录内容存入文件对象数组中
        File[] files = src.listFiles();
        // 遍历该目录
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                deleteFile(file);
            }
        }
        src.delete();



    }
}
