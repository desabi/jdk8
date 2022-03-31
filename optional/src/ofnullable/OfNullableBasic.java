package ofnullable;

import java.util.Optional;

public class OfNullableBasic {
    public static void main(String[] args) {

        // the argument passed to the of() method can't be null.
        // Otherwise, we'll get a NullPointerException:

        // But in case we expect some null values,
        // we can use the ofNullable() method:

        System.out.println("of nullable null: " + Optional.ofNullable(null));

        Optional<Object> optionalNull = Optional.ofNullable(null);
        System.out.println("optional null: " + optionalNull);
        System.out.println("optinal null is present: " + optionalNull.isPresent());
        System.out.println("optional null is empty: " + optionalNull.isEmpty());

    }
}
