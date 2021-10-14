package breturn;

import avoid.MyFunctionalInterface;

import java.util.function.BiFunction;

public class MethodReference {
    public static void main(String[] args) {
        String nameArg = "desabi";

        //lambda
        Greet greet1 = nameParameter -> "Hola " + nameParameter;
        System.out.println(greet1.getMessage(nameArg));

        // method reference
        // String::toUpperCase retorna un String
        // el metodo greetMessage de interface funcional Greet retorna un String
        Greet greet2 = String::toUpperCase;
        System.out.println("The name " + nameArg + " toUpperCase is: " + greet2.getMessage(nameArg));
    }
}
