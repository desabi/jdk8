package acreate;

import util.Employee;

import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {

        System.out.println("=== Stream.of ===");
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

        Stream.of(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        ).forEach(System.out::println);

    }
}
