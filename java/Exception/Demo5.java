package Exception;

public class Demo5 {
    public static void main(String[] args) {

        int[] arr =null;
        try {
            int max = getMax(arr);
            System.out.println(max);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }catch (IndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }

    }

    public static int getMax(int[] arr){
        if (arr == null){
           throw new NullPointerException();
        }
        if (arr.length == 0){
            throw new IndexOutOfBoundsException();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
