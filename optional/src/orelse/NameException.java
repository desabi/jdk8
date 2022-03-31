package orelse;

import java.util.Optional;

public class NameException {
    public static void main(String[] args) {
        String nullName = null;

        // java 10
        String name = Optional.ofNullable(nullName).orElseThrow();
    }
}
