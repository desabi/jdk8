package traversinobject;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TraverseObject {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
          new Car("Nissan", "Sentra"),
          new Car("Chevrolet", "Vega"),
          new Car("Hyundai", "Elantra")
        );

        // traditional way
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // Consumers: is used to process data,
        // takes an argument of type T and has return type void (accept)
        // method: accept

//        Car theCar = new Car("Toyota", "SUV 2022");
//        Consumer<Car> carConsumer = car -> System.out.println(car);
//        carConsumer.accept(theCar);

        // forEachRemaining: Traversing Objects Using Iterators
        // in the next examples, the method accept is not used
        // that is because the method for each remaining does that
        System.out.println("FOR-EACH-REMAINING");
        Consumer<Car> carConsumer = car -> System.out.println(car);
        cars.iterator().forEachRemaining(carConsumer);

        // in the next example, the method accept is not used
        // that is because the method for each remaining does that
        cars.iterator().forEachRemaining(car -> System.out.println(car));

        // forEachRemaining: method reference
        cars.iterator().forEachRemaining(System.out::println);

        // foreach:  Traversing Iterable Objects
        System.out.println("FOR-EACH");
        cars.forEach(carConsumer);
        cars.forEach(car -> System.out.println(car));
        cars.forEach(System.out::println);
    }
}
