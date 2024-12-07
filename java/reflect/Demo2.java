package reflect;

import java.lang.reflect.Constructor;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class c1 = Class.forName("reflect.Student");

        Constructor[] constructors = c1.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("============================================");

        Constructor[] declaredConstructors = c1.getDeclaredConstructors();

        for (Constructor dc : declaredConstructors) {
            System.out.println(dc);
        }
        System.out.println("============================================");

        Constructor con1 = c1.getDeclaredConstructor();
        System.out.println(con1);

        Constructor con4 = c1.getDeclaredConstructor(String.class);
        System.out.println(con4);

        Constructor con2 = c1.getDeclaredConstructor(int.class);
        System.out.println(con2);

        Constructor con3 = c1.getDeclaredConstructor(String.class, int.class);
        System.out.println(con3);




    }
}
