package breturn;

import java.util.function.BiFunction;

public class MethodReference {
    public static void main(String[] args) {
        String nameArg = "desabi";

        //lambda
        Greet greet = nameParameter -> "Hola " + nameParameter;
        System.out.println(greet.getMessage(nameArg));

        //method reference
        Greet::getMessage
    }
}
