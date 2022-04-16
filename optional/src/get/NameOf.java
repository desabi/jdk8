package get;

import java.util.Optional;

public class NameOf {
    public static void main(String[] args) {

        // Optional.of
        String notNullName = "Jada";
        Optional<String> optionalName = Optional.of(notNullName);
        System.out.println("optionalName = " + optionalName.get());

        String nullName = null;
        Optional<Object> optionalNameB = Optional.of(nullName); //NullPointerException, utilizar ofNullable
        System.out.println("optionalNameB = " + optionalNameB.get());
    }
}
