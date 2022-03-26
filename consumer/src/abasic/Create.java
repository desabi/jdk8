package abasic;

import traversinobject.Car;

import java.util.function.Consumer;

public class Create {

    private static int total = 0;

    public static void main(String[] args) {

        // Consumers: is used to process data,
        // takes an argument of type T and has return type void (accept)
        // method: accept
        Consumer<Integer> integerConsumer = number -> total += number;
        integerConsumer.accept(3);
        integerConsumer.accept(4);

        System.out.println(total);

        Car theCar = new Car("Toyota", "SUV 2022");
        Consumer<Car> carConsumer = car -> System.out.println(car);
        carConsumer.accept(theCar);
    }
}
