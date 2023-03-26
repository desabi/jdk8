package com.desabisc.predicate;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
public class PredicateUse {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        Predicate<String> startsWithS = name -> name.startsWith("S");

        List<String> collect = names.stream()
                .filter(startsWithS) // como aplica el metodo test automaticamente?
                .collect(Collectors.toList());

        log.info("Names with S: {}", collect);

    }
}
