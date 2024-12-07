package file;

import java.io.File;

public class LxDemo3 {
    public static void main(String[] args) {
        File f = new File("D:\\");
        getAvi(f);
    }
    public static void getAvi(File f){
        File[] files = f.listFiles();
        if (files!=null){
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".avi")){
                    System.out.println(file);
                }
                if (file.isDirectory()){
                    getAvi(file);
                }

            }
        }


    }
}
