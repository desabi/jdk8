package get;

import java.util.Optional;

public class NameOfNullable {
    public static void main(String[] args) {

        // Optional.ofNullable
        String notNullName = "Jada";
        Optional<String> optionalName = Optional.ofNullable(notNullName);
        System.out.println("optionalName = " + optionalName.get());

        String nullName = null;
        Optional<Object> optionalNameB = Optional.ofNullable(nullName);
        //System.out.println("optionalNameB = " + optionalNameB.get()); //NoSuchElementException

        // para que no lance excepcion, se puede usar orElse
        String name = Optional.ofNullable(nullName).orElse("Empty name");
        System.out.println("name = " + name);
    }
}
