package com.desabisc.excercises;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class RemoveDuplicates {
    /*
    * Write a Java program to remove all duplicate elements from a list using streams.
    * */
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "strawberry", "apple", "lemon", "orange", "kiwi");
        List<String> list = fruits.stream().distinct().toList();
        log.info("fruits with repeated values: {}", fruits);
        log.info("fruits without repeated values: {}", list);
    }
}
