package fangfayinyong;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] arr ={1,2,4,5,6,8,1,10,25};

        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        // lambda
        Arrays.sort(arr,(Integer o1, Integer o2) ->{
                return o2-o1;
            }
        );
        System.out.println(Arrays.toString(arr));

        // lambda 简化
        Arrays.sort(arr,(o1,o2)->o2-o1);
        System.out.println(Arrays.toString(arr));


        // 方法引用
        Arrays.sort(arr,Demo1::test);
        System.out.println(Arrays.toString(arr));
    }

    public static int test(int a,int b){
        return a-b;
    }
}
