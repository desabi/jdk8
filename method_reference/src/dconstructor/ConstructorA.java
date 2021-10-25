package dconstructor;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorA {
    public static void main(String[] args) {
        /* Sometimes the body of a lambda expression may be just an object creation expression.
        * The syntax for using a constructor reference is as follows:
        * ClassName::new
        * ArrayTypeName::new
        * */

        // Suppliers: used to generate data, takes no arguments and returns an object of type T (get)
        // Functions: converting an object of type T to one of type R (apply)
        Supplier<String> supplierA = () -> new String();
        Supplier<String> supplierB = () -> new String("DESABI");
        Function<String, String> functionA = stringParam -> new String(stringParam);

        System.out.println("Supplier A: " + supplierA.get());
        System.out.println("Supplier B: " + supplierB.get());
        System.out.println("Function A:" + functionA.apply("String Argument"));

        // method reference
        Supplier<String> supplierC = String::new;
        Function<String, String> functionB = String::new;

        System.out.println("Supplier C:" + supplierC.get());
        System.out.println("Function B: " + functionB.apply("The String Argument"));
    }
}
