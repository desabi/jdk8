package cinstance;

import java.util.Random;
import java.util.function.Supplier;

public class BoundReceiverA {
    public static void main(String[] args) {

        // Suppliers: used to generate data,
        // takes no arguments and returns an object of type T ( method get).
        Supplier<Integer> integerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        System.out.println(integerSupplier.get());

        // You can specify the receiver of the method invocation explicitly (bound receiver)
        // objectRef::instanceMethod (bound receiver)
        Supplier<Integer> supplierA = () -> "Ellen".length();
        Supplier<Integer> supplierB = "Ellen"::length;

        // El método length() no recibe ningún parámetro y retorna un int
        // El método get (de Supplier<Integer>) no recibe ningún parámetro y devuelve un Integer
        // Los dos métodos coinciden en la cantidad de parámetros y el tipo de retorno

        System.out.println(supplierA.get());
        System.out.println(supplierB.get());


    }
}
