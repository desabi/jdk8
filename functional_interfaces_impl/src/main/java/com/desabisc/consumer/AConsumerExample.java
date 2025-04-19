package com.desabisc.consumer;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

/**
 * Consumer: is used to process data
 * takes an argument of type T and has return type void
 * method .accept()
 */
@Slf4j
public class AConsumerExample {
    private static int total = 0;

    public static void main(String[] args) {
        Consumer<Integer> consumer = numberParam -> total += numberParam;
        consumer.accept(4);
        consumer.accept(5);
        log.info("total: {}", total);
    }
}
