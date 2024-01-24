package com.desabisc.excercises;

import com.desabisc.util.Util;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class FindElements {
    /*
    * Write a Java program to find the second smallest and largest elements in a list of integers using streams.
    * */
    public static void main(String[] args) {
        List<Integer> randomList = Util.getRandomList();
        List<Integer> orderedList = randomList.stream().sorted().toList();

        Integer secondSmallest = randomList.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        Integer secondLargest = randomList.stream().distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);

        log.info("ramdom list: {}", randomList);
        log.info("ordered list: {}", orderedList);
        log.info("secondSmallest: {}", secondSmallest);
        log.info("secondLargest: {}", secondLargest);
    }
}
