package avoid;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int numberArgument = 34;

        // expression form
        MyFunctionalInterface myFunctionalInterface1 = numberParameter -> System.out.println("The number is: " + numberParameter);
        myFunctionalInterface1.myFunctionalMethod(numberArgument);

        // Block form
        MyFunctionalInterface myFunctionalInterface2 = numberParameter -> {
            System.out.println("The number is: "+ numberParameter);
            System.out.println("The number plus ten is: " + (numberParameter+10));
        };

        myFunctionalInterface2.myFunctionalMethod(numberArgument);

    }
}
