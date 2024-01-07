package com.desabisc.consumer;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

@Slf4j
public class ConsumerUse {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("Nissan", "Sentra"),
                new Car("Chevrolet", "Vega"),
                new Car("Hyundai", "Elantra")
        );

        // traditional way
        log.info("----ITERATOR----");
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            log.info("{}", iterator.next());
        }

        // Consumer: is used to process data
        // takes an argument of type T and has return type void
        // method .accept()
        log.info("----CONSUMER-----");
        Car carParameter = new Car("Toyota", "SUV 2022");

        Consumer<Car> consumer = carArgument -> log.info("{}", carArgument);
        consumer.accept(carParameter);

        log.info("-----FOREACHREMAINING--------");
        // forEachRemaining
        // in the next examples, the method accept is not used
        // that is because the method forEachRemaining() does that
        cars.iterator().forEachRemaining(consumer);

        // usar el consumer de manera directa
        log.info("-------FOREACHREMAINING----------\n");
        cars.iterator().forEachRemaining(carArgument -> log.info("{}", carArgument));

        //forEachRemaining: method reference
        log.info("-----FOREACHREMAINING: METHOD REFERENCE---------------");
        cars.iterator().forEachRemaining(System.out::println);

        //forEach: traversing Iterable Objects
        log.info("------FOREACH--------------");
        cars.forEach(consumer);
        cars.forEach(carArgument -> log.info("{}", carArgument));
        cars.forEach(System.out::println);
    }
}
