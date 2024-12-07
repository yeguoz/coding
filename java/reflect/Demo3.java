package reflect;

import java.lang.reflect.Field;

public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c = Class.forName("reflect.Student");

        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==================");
        Field[] df = c.getDeclaredFields();
        for (Field field : df) {
            System.out.println(field);
        }
        System.out.println("==================");

        Field age = c.getDeclaredField("age");
        System.out.println(age);
        int modifiers = age.getModifiers();
        System.out.println(modifiers);

    }
}
