package com.desabisc.function;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class FunctionUse {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");

        //Function<String, Integer> namesLength = name -> name.length();
        Function<String, Integer> namesLength = String::length;

        List<Integer> collect = names.stream()
                .map(namesLength)
                .collect(Collectors.toList());

        log.info("Collect: {} ", collect);
    }
}
