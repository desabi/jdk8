package com.desabisc.function;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionStreams {
    /**
     * The Stream API in Java often utilizes the Function functional interface in various methods to perform transformations,
     * mappings, and other operations on stream elements.
     * Some common methods that use Function interfaces in the Stream API include:
     * */
    public static void main(String[] args) {
        /*
        * map: This method applies a function to each element in the stream and returns a new stream of the results.
        * */
        // Example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).toList();
        System.out.println("squaredNumbers = " + squaredNumbers);

        /*
        * flatMap: This method is similar to map, but when the function applied returns a stream or collection,
        * flatMap flattens the result into a single stream.
        * */
        // Example
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flattenedList = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("flattenedList = " + flattenedList);

        /*
        * collect: While not directly using Function as a parameter, the collect method often makes use of Collector
        * which internally utilizes Function interfaces to perform the accumulation of elements into a container.
        * */
        // Example - collecting to a map using Function
        List<String> strings = Arrays.asList("apple", "banana", "orange");
        Map<String, Integer> stringLengthMap = strings.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("stringLengthMap = " + stringLengthMap);

        /*
        * sorted: The sorted method also uses a Comparator functional interface, which can be constructed using Function
        *  when comparing elements based on a function's result.
        * */
        // Example - sorting by string length
        List<String> strings1 = Arrays.asList("apple", "banana", "orange");
        List<String> sortedByLength = strings1.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println("sortedByLength = " + sortedByLength);
    }

}
