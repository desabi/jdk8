package com.desabisc.excercises;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class OrderWords {
    /*
    * Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
    * */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("jeff", "mark", "linus", "steve", "bill", "elon");
        List<String> list = names.stream().sorted().toList();
        log.info("names: {}", list);
    }
}
