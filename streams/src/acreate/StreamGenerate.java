package acreate;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        System.out.println("=== Stream.generate ===");
        Supplier<Integer> supplierRandomNumbers = () -> (new Random()).nextInt(100);
        Stream<Integer> tenRandomNumbers = Stream.generate(supplierRandomNumbers).limit(10);

        // traversing
        tenRandomNumbers.forEach(System.out::println);
    }
}
