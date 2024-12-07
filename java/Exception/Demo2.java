package Exception;

public class Demo2 {
    public static void main(String[] args) {


        int[] arr = {1,2,4,3,5};

        try{
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error：索引越界");
        }
        System.out.println("执行没");
    }
}
