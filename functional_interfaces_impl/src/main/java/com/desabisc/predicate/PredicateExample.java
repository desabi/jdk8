package com.desabisc.predicate;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
public class PredicateExample {
    public static void main(String[] args) {

        // Predicate is a functional interface whose functional method, called test,
        // evaluates a condition on an input variable of a generic type.
        // The test method returns true if the condition is true, and false otherwise.

                // declare a Predicate
        Predicate<Integer> isPositive = number -> number > 0;
        int aPositive = 10;
        int aNegative = -5;

        // use the test method from a Predicate
        log.info("Is Positive: {}", isPositive.test(aPositive));
        log.info("Is Positive: {}", isPositive.test(aNegative));

        // como usar un Predicate sin llamar al metodo test?

    }
}
