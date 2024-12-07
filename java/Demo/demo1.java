package Demo;

public class demo1 {
    public static void main(String[] args) {

        int result = getSum(1,2,3,4,5,6,7,8);

        System.out.println(result);
    }

    public static int getSum(int...args){
        int sum = 0;
        for (int arg : args) {
            sum = sum + arg;
        }
        return sum;
    }
}
