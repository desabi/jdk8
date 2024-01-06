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

        int positiveArg = 10;
        int negativeArg = -5;

        // Predicate is a functional interface whose functional method, called test,
        // evaluates a condition on an input variable of a generic type.
        // The test method returns true if the condition is true, and false otherwise.

        // declare a Predicate
        Predicate<Integer> isPositive = numberParam -> numberParam > 0;


        // use the test method from a Predicate
        log.info("Is Positive: {}", isPositive.test(positiveArg));
        log.info("Is Positive: {}", isPositive.test(negativeArg));

        // como usar un Predicate sin llamar al metodo test?

    }
}
