package com.desabisc.function;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Function is a functional interface with two type parameters T and R.
 * Its functional method apply(), takes an argument of type T and returns an object of type R.
 * Functions are ideal for converting an object of type T to one of type R.
 */
@Slf4j
public class BFunctionUse {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Smith", "Samuel", "Katey", "Sie");

        //Function<String, Integer> namesLength = name -> name.length();
        Function<String, Integer> namesLength = String::length;

        List<Integer> collect = names.stream()
                .map(namesLength) // How does the apply() method run automatically?
                .collect(Collectors.toList());

        log.info("Collect: {} ", collect);
    }
}
