package com.desabisc.function;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

/**
 * Function is a functional interface with two type parameters T and R.
 * Its functional method apply(), takes an argument of type T and returns an object of type R.
 * Functions are ideal for converting an object of type T to one of type R.
 */
@Slf4j
public class AFunctionExample {
    public static void main(String[] args) {
        // Create the function
        Function<String, Integer> myFunction = numberAsText -> Integer.parseInt(numberAsText);

        String numberAsTextVar = "100";
        // How to use a Function without call the apply() method?
        Integer numberAsInteger = myFunction.apply(numberAsTextVar);

        log.info("Result: {}", numberAsInteger);
    }
}
