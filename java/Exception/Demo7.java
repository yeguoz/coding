package Exception;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GirlFriend gf = new GirlFriend();

        while (true) {
            try {
                System.out.println("请输入女朋友姓名：");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("请输入女朋友年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);

                System.out.println(gf);
                break;
            } catch (NameFormatException | AgeOutBoundsException e) {
                e.printStackTrace();
            }
        }
    }
}
