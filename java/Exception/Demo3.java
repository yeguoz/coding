package Exception;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        try{
            System.out.println(2/0);
            System.out.println(arr[10]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("sssssss");

        }catch (ArithmeticException e){
            System.out.println("aaaaa");
        }

        System.out.println("执行没");
    }
}
