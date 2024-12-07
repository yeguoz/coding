package reflect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class LxDemo1 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student stu = new Student("小明",23,"北京","23是大学生，学java狠狠赚他一笔");
        String s = saveObject(stu);

        System.out.println(s);
    }

    public static String saveObject(Object obj) throws IllegalAccessException, IOException {
        Class clazz = obj.getClass();
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\aaa\\obj.txt"));
        // 获取字段和值
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            // 获取字段名 
            String name = field.getName();
            // 获取字段值
            Object value = field.get(obj);
            // 使用IO流保存文件中
            bw.write(name+"="+value);
            bw.newLine();
            //System.out.println(name+"="+value);
        }
        bw.close();
        return "success";
    }
}
