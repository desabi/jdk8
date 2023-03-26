package com.desabisc.predicate;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = number -> number >= 0;
        int aPositive = 10;
        int aNegative = -5;

        log.info("Is Positive: {}", isPositive.test(aPositive));
        log.info("Is Positive: {}", isPositive.test(aNegative));
    }
}
