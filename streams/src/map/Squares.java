package map;

import java.util.List;
import java.util.function.Function;

public class Squares {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        Function<Integer, Integer> functionSquares = number -> number * number;

        // map() method is used to apply a function to each element of a Collection
        // and return a new Collection of the computed values.

        // Convert each value to its square.
        numbers.stream().map(functionSquares).forEach(System.out::println);
    }
}
