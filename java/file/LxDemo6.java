package file;

import java.io.File;

public class LxDemo6 {
    public static void main(String[] args) {
        File f = new File("F:\\");
        long size = getSize(f);
        System.out.println(size);
    }

    private static long getSize(File src) {
        File[] files = src.listFiles();
        long size = 0;
        if(files!=null){
            for (File file : files) {
                if (file.isFile()){
                    long length = file.length();
                    size = size+length;
                }else {
                    size = size + getSize(file);
                }

            }
        }

        return size;

    }
}
