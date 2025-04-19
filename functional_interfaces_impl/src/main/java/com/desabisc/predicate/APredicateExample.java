package com.desabisc.predicate;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

/**
 * Predicate is a functional interface whose functional method, called test,
 * evaluates a condition on an input variable of a generic type.
 * The test method returns true if the condition is true, and false otherwise.
 */
@Slf4j
public class APredicateExample {
    public static void main(String[] args) {
        int positiveArg = 10;
        int negativeArg = -5;

        // declare a Predicate
        Predicate<Integer> isPositive = numberParam -> numberParam > 0;

        // use the test() method from a Predicate
        log.info("Is Positive: {}", isPositive.test(positiveArg));
        log.info("Is Positive: {}", isPositive.test(negativeArg));

        // como usar un Predicate sin llamar al metodo test?

    }
}
