package stream;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,78,9,42};

        Arrays.stream(arr).forEach(i-> System.out.println(i));

    }
}
