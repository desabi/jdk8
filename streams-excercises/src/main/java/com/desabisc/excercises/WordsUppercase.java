package com.desabisc.excercises;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class WordsUppercase {
    /*
    * Write a Java program to convert a list of strings to uppercase or lowercase using streams.
    * */
    public static void main(String[] args) {
        List<String> words = Arrays.asList("smartphone", "server", "laptop", "mouse", "keyboard");

        List<String> list = words.stream().map(String::toUpperCase).toList();
        log.info("list: {}", list);
    }
}
