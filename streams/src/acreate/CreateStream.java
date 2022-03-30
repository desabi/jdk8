package acreate;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

        Stream<Integer> theNumbers = Stream.of(1, 2, 3, 4, 5);


        System.out.println("--------------------------------------");
        Supplier<Integer> supplierRandomNumbers = () -> (new Random()).nextInt(100);
        Stream<Integer> tenRandomNumbers = Stream.generate(supplierRandomNumbers).limit(10);

        // traversing
        tenRandomNumbers.forEach(System.out::println);


    }
}
