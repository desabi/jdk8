package com.desabisc.consumer;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class ConsumerExample {
    private static int total = 0;

    public static void main(String[] args) {
        Consumer<Integer> consumer = numberParam -> total += numberParam;
        consumer.accept(4);
        consumer.accept(5);
        log.info("total: {}", total);
    }
}
