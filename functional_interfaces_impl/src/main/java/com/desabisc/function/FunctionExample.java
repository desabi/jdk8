package com.desabisc.function;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

@Slf4j
public class FunctionExample {
    public static void main(String[] args) {
        // Function is a functional interface with two type parameters T and R.
        // Its functional method, called apply, takes an argument of type T and returns an object of type R.
        // Functions are ideal for converting an object of type T to one of type R.

        Function<String, Integer> myFunction = numberAsText -> Integer.parseInt(numberAsText);
        String numberAsTextVar = "100";

        // como usar una Function sin llamar al metodo apply?
        Integer numberAsInteger = myFunction.apply(numberAsTextVar);

        log.info("Result: {}", numberAsInteger);
    }
}
