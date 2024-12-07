package Exception;

public class Demmo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,7,9};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            String message = e.getMessage();
//            System.out.println(message);

//            String str = e.toString();
//            System.out.println(str);


            e.printStackTrace();


        }
        System.out.println("111111");
    }
}
