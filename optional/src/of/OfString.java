package of;

import java.util.Optional;

public class OfString {
    public static void main(String[] args) {

        String name = "desabi";
        Optional<String> optionalName = Optional.of(name);
        System.out.println(optionalName.isPresent());

        // the argument passed to the of() method can't be null.
        // Otherwise, we'll get a NullPointerException:
        String color = null;
        Optional<String> optionalColor = Optional.of(color);
        System.out.println(optionalColor.isPresent());

        // But in case we expect some null values, we can use the ofNullable() method
    }
}
