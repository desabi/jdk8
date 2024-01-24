package com.desabisc.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {
    public static List<Integer> getRandomList() {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // generates a random integer
            randomList.add(randomNumber);
        }
        return randomList;
    }
}
