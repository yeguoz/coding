package Exception;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {

        try {
            String name = setName();
            int age = setAge();
            System.out.println(name);
            System.out.println(age);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }catch (RuntimeException e){
            throw new RuntimeException();
        }
    }

    public static String setName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女朋友姓名");
        String name = sc.nextLine();
        if (name.length()<3 || name.length()>10){
            throw new RuntimeException();
        }

        return name;
    }
    public static int setAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女朋友年龄");
        int age = sc.nextInt();
        if (age<18 || age>40){
            throw new NumberFormatException();
        }

        return age;
    }
}
