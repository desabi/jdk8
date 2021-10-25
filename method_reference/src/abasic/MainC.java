package abasic;

import java.util.function.Consumer;

public class MainC {
    public static void main(String[] args) {

        String textArg = "Good Day";

        //Consumer: is used to process data, takes an argument of type T and has return type void (method accept)
        // lambda expression
        Consumer<String> consumerA = textParam -> System.out.println(textParam);
        MyConsumer myConsumerA = textParam -> System.out.println(textParam);
        // method reference
        Consumer<String> consumerB = System.out::println;
        // System.out.println retorna void
        // el metodo accept de MyConsumer retorna void
        MyConsumer myConsumerB = System.out::println;

        consumerA.accept(textArg);
        myConsumerA.accept(textArg);
        consumerB.accept(textArg);
        myConsumerB.accept(textArg);
    }
}
