package reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class LxDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties prop = new Properties();
        // 读取配置文件内容
        BufferedReader br = new BufferedReader(new FileReader("E:\\ideaIU-2021.1.3\\dangaodian\\Web工程源码\\Test\\src\\pro.properties"));
        prop.load(br);

        String className = (String)prop.get("className");
        String method = (String) prop.get("method");
        // 利用反射创建对象
        Class clazz = Class.forName(className);
        Constructor con = clazz.getDeclaredConstructor();

        Object o = con.newInstance();
        System.out.println(o);
        Method m = clazz.getDeclaredMethod(method);
        m.setAccessible(true);
        m.invoke(o);

    }
}
