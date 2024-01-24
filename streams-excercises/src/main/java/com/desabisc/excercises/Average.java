package com.desabisc.excercises;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class Average {
    // https://www.w3resource.com/java-exercises/stream/index.php
    // Write a Java program to calculate the average of a list of integers using streams.
    public static void main(String[] args) {
        double average = Stream.of(7, 8, 9, 10)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);//Default value if the list is empty

        log.info("Average: {}", average);
    }
}
