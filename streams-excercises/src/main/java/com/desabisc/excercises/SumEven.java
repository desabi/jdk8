package com.desabisc.excercises;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class SumEven {
    /*
    * Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
    * */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> predicate = number -> number %2 ==0;

        int sum = numbers.stream()
                .filter(predicate)
                .mapToInt(Integer::intValue)
                .sum();

        log.info("sum: {}", sum);
    }
}
