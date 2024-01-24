package com.desabisc.excercises;

import com.desabisc.util.Util;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.function.Supplier;

@Slf4j
public class MaxMinValues {
    /*
    * Write a Java program to find the maximum and minimum values in a list of integers using streams
    * */
    public static void main(String[] args) {
        List<Integer> randomNumbers = Util.getRandomList();

        //Integer max = randomNumbers.stream().max(Comparator.comparing(Integer::intValue)).get();
        //Integer min = randomNumbers.stream().min(Comparator.comparing(Integer::intValue)).get();
        Integer max = randomNumbers.stream().max(Integer::compare).get();
        Integer min = randomNumbers.stream().min(Integer::compare).get();

        log.info("random numbers: {}", randomNumbers);
        log.info("max value: {}", max);
        log.info("min value: {}", min);
    }


}
