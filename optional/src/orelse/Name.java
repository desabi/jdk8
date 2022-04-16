package orelse;

import java.util.Optional;

public class Name {
    public static void main(String[] args) {
        String name = null;

        String notNullName = Optional.ofNullable(name).orElse("john");
        System.out.println("Not null name: " + notNullName); // john
    }
}
