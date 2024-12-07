package stream_;

import java.util.stream.Stream;

public class ValuesDemo {
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6).forEach(v-> System.out.println(v));
        Stream.of("a","b","c","d").forEach(s-> System.out.println(s));

    }
}
