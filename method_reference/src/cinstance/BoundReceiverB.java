package cinstance;

import java.util.function.Consumer;

public class BoundReceiverB {
    private static int total = 0;
    public static void main(String[] args) {

        // Consumers: is used to process data,
        // takes an argument of type T and has return type void (accept)
        Consumer<Integer> consumer = numberParam -> total += numberParam;
        consumer.accept(4);
        consumer.accept(3);

        System.out.println(total);

        String stringArg = "Hello";

        // You can specify the receiver of the method invocation explicitly (bound receiver)
        // objectRef::instanceMethod (bound receiver)
        Consumer<String> consumerA = stringParam -> System.out.println(stringParam);
        Consumer<String> consumerB = System.out::println;

        // El método println recibe un parámetro de tipo String y retorna void
        // El método accept (de Consumer<String>) recibe un parámetro de tipo String y retorna void
        // Los dos métodos coinciden en la cantidad de parámetros y el tipo de retorno

        consumerA.accept(stringArg);
        consumerB.accept(stringArg);
    }
}
