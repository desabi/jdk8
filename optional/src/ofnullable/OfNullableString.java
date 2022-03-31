package ofnullable;

import java.util.Optional;

public class OfNullableString {
    public static void main(String[] args) {

        // the argument passed to the of() method can't be null.
        // Otherwise, we'll get a NullPointerException:

        // But in case we expect some null values,
        // we can use the ofNullable() method:
        String name = "desabi";
        Optional<String> optionalName = Optional.ofNullable(name);
        // true
        System.out.println(optionalName.isPresent());

        String color = null;
        System.out.println(Optional.ofNullable(color)); // Optional.empty

        Optional<String> optionalColor = Optional.ofNullable(color);
        System.out.println(optionalColor.isPresent()); // false


    }
}
