package com.desabisc.supplier;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierStream {
    /*
    * The Supplier functional interface within the Stream API is typically used to generate or provide elements or values when necessary.
    * While not directly a part of the Stream API, Supplier is often used in combination with stream generation
    * or terminal operations that need initial values.
    * Here are some scenarios where Supplier can be indirectly used within the Stream API:
    * */
    public static void main(String[] args) {
      /*
      * Stream.generate: The Stream.generate method takes a Supplier and creates an infinite stream of elements
      * by repeatedly calling the Supplier to generate values
      * */
        // Example
        Stream<String> randomStream = Stream.generate(() -> UUID.randomUUID().toString());
        randomStream.limit(5).forEach(System.out::println);

        /*
        * Stream.iterate: Similar to Stream.generate, Stream.iterate also takes a Supplier but allows for generating
        * a stream where each element is derived from the previous one.
        * */
        // Example
        Stream<Integer> powersOfTwo = Stream.iterate(1, n -> n * 2);
        powersOfTwo.limit(5).forEach(System.out::println);

        /*
        * Collectors.toCollection: While not a stream operation per se, when collecting elements into a collection
        * using Collectors.toCollection, you can specify a Supplier to create a particular type of collection.
        * */
        // Example
        Stream<String> strings = Stream.of("apple", "banana", "orange");
        ArrayList<String> collected = strings.collect(Collectors.toCollection(ArrayList::new));
        System.out.println("collected = " + collected);

        /*
        * Terminal operations: In custom terminal operations or computations where an initial value is required,
        *  a Supplier might be used to provide that initial value.
        * */
        // Example - finding maximum using a custom terminal operation
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Integer maxNumber = numbers.reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("maxNumber = " + maxNumber);
    }
}
