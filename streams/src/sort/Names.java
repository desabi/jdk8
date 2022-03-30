package sort;

import java.util.stream.Stream;

public class Names {
    public static void main(String[] args) {

        Stream.of("Kyle", "Jaquilini", "Jimmy")
                .sorted()
                .forEach(System.out::println);
    }
}
