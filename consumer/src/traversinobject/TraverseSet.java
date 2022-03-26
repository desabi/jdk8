package traversinobject;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TraverseSet {
    public static void main(String[] args) {

        // forEachRemaining: Traversing Objects Using Iterators
        // foreach:  Traversing Iterable Objects

        Set<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Consumer<String> colorConsumer = color -> System.out.println(color);

        System.out.println("FOREACHCONSUMER");
        colors.iterator().forEachRemaining(colorConsumer);
        colors.iterator().forEachRemaining(color -> System.out.println(color));
        colors.iterator().forEachRemaining(System.out::println);

        System.out.println("FOREACH");
        colors.forEach(colorConsumer);
        colors.forEach(color -> System.out.println(color));
        colors.forEach(System.out::println);
    }
}
