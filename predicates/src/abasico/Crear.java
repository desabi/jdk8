package abasico;

import java.util.function.Predicate;

public class Crear {
    public static void main(String[] args) {
        int theNumber = 0;

        // Predicates: evaluates a condition on an input and return true or false
        // Method: test
        Predicate<Integer> predicatePositive = number -> number>0;
        boolean isPositive = predicatePositive.test(theNumber);

        System.out.println("The number " + theNumber + " is positive: " + isPositive);
        System.out.println("The number " + theNumber + " is positive: " + predicatePositive.test(theNumber));
    }
}
