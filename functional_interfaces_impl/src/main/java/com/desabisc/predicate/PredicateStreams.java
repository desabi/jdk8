package com.desabisc.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateStreams {
    /**
     * The Predicate functional interface within the Stream API is used to perform filtering operations on elements
     * within a stream based on some condition.
     * Several methods in the Stream API utilize the Predicate interface:
     * */
    public static void main(String[] args) {
        /*
        * filter: The filter method takes a Predicate as an argument and returns a stream consisting of elements
        * that match the given predicate.
        * */
        // Example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("evenNumbers = " + evenNumbers);

        /*
        * allMatch, anyMatch, noneMatch: These methods check if all, any, or none of the elements in the stream match
        * the specified Predicate.
        * */
        // Example
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        boolean allEven = numbers1.stream().allMatch(n -> n % 2 == 0);
        boolean anyEven = numbers1.stream().anyMatch(n -> n % 2 == 0);
        boolean noneEven = numbers1.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("allEven = " + allEven);
        System.out.println("anyEven = " + anyEven);
        System.out.println("noneEven = " + noneEven);

        /*
        * takeWhile, dropWhile: Introduced in Java 9, these methods use Predicate to conditionally include or exclude elements
        * from the stream based on the given predicate.
        * */
        // Example
        List<Integer> numbers2 = Arrays.asList(2, 4, 6, 1, 3, 5);
        List<Integer> takenWhileEven = numbers2.stream().takeWhile(n -> n % 2 == 0).toList();
        List<Integer> droppedWhileEven = numbers2.stream().dropWhile(n -> n % 2 == 0).toList();
        System.out.println("takenWhileEven = " + takenWhileEven);
        System.out.println("droppedWhileEven = " + droppedWhileEven);
    }
}
