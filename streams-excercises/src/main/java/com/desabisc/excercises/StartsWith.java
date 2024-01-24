package com.desabisc.excercises;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class StartsWith {
    /*
    *  Write a Java program to count the number of strings in a list that start with a specific letter using streams.
    * */
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("ape", "alligator", "buffalo", "butterfly", "caiman", "caracal", "donkey");

        Predicate<String> predicate = animal -> animal.startsWith("a");
        List<String> list = animals.stream().filter(predicate).toList();
        log.info("animals: {}", list);
    }
}
