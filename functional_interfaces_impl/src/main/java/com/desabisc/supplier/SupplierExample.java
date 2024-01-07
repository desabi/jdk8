package com.desabisc.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        /*
        * Supplier is a functional interface that is used to generate data.
        * Takes no arguments and returns a value.
        * method: get()
        * */

        Supplier<Integer> integerSupplier = () -> {
            Random randomGenerator = new Random();
            return randomGenerator.nextInt(100);
        };
        System.out.println("Supplier.get() = " + integerSupplier.get());

        Supplier<LocalDateTime> supplierLocalDateTime = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplierLocalDateTime.get();
        System.out.println("localDateTime = " + localDateTime);

        Supplier<String> supplierString = () -> dtf.format(LocalDateTime.now());
        String StringTime = supplierString.get();
        System.out.println("StringTime = " + StringTime);
    }
}
