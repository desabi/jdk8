package map;

import java.util.List;
import java.util.function.Function;

public class Squares {
    /**
     * Function is a functional interface with two type parameters T and R.
     * Its functional method, called apply, takes an argument of type T and returns an object of type R.
     * Functions are ideal for converting an object of type T to one of type R.
     * */
    public static void main(String[] args) {
        // map() method is used to apply a function to each element of a Collection
        // and return a new Collection of the computed values.

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        Function<Integer, Integer> functionSquares = number -> number * number;
        //functionSquares.apply(10);

        // Convert each value to its square.
        // ¿Como se aplica el metodo apply()?
        numbers.stream().map(functionSquares).forEach(System.out::println);
        //numbers.stream().map(number -> number * number).forEach(System.out::println);
    }
}
