package com.desabisc.consumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerStreams {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "orange", "grape");

        // Define a Consumer to convert strings to uppercase
        Consumer<String> stringToUpperCase = s -> System.out.println(s.toUpperCase());

        // Use stream and forEach to apply the Consumer on each string
        System.out.println("\nforEach");
        strings.stream().forEach(stringToUpperCase);
        System.out.println("\nforEachOrdered()");
        strings.stream().forEachOrdered(stringToUpperCase);

        // peek
        // Example
        System.out.println("\npeek()");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(n -> n % 2 == 0).peek(System.out::println).count();

    }
}
