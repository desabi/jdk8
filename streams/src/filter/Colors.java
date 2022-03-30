package filter;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Colors {
    public static void main(String[] args) {

        Stream.of("RED", "GREEN", "BLUE", "RED")
                .filter(color -> color.equals("RED"))
                .forEach(System.out::println);

        // chained
        System.out.println("------------------------------------");
        Predicate<String> isRed = color -> color.equals("RED");
        Stream.of("RED, GREEN", "BLUE", "RED")
                .filter(isRed.or(color -> color.indexOf("R") > -1 ))
                .forEach(color -> System.out.println(color));
    }
}
