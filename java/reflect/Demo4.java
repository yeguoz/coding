package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c = Class.forName("reflect.Student");

        Method m = c.getDeclaredMethod("eat",String.class);
        System.out.println(m);


        Student stu = new Student();
        m.setAccessible(true);
        Object result = m.invoke(stu, "汉堡");
        System.out.println(result);




    }
}
