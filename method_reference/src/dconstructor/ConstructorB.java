package dconstructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorB {
    public static void main(String[] args) {
        /* Sometimes the body of a lambda expression may be just an object creation expression.
         * The syntax for using a constructor reference is as follows:
         * ClassName::new
         * ArrayTypeName::new
         * */

        // Suppliers: used to generate data, takes no arguments and returns an object of type T (get)
        Supplier<Item> supplierA = () -> new Item();
        Supplier<Item> supplierB = Item::new;
        // se toma el constructor vacio
        System.out.println("Supplier A: " + supplierA.get());
        System.out.println("Supplier B: " + supplierB.get());
        System.out.println("-------------------------------------");

        String nameArg = "Samsung Galaxy A71";
        // Functions: converting an object of type T to one of type R (apply)
        Function<String, Item> functionA = nameParam -> new Item(nameParam);
        Function<String, Item> functionB = Item::new;
        // se toma el constructor con un parametro
        // el metodo constructor new tiene un parametro de tipo String
        // el metodo apply recibe un parametro de tipo string y retorna un objeto Item
        Item itemA = functionB.apply(nameArg);

        System.out.println("Function A: " + functionA.apply(nameArg));
        System.out.println("Function B: " + itemA);
        System.out.println("-------------------------------------");

        Double priceArg = 8999.99;

        BiFunction<String, Double, Item> biFunctionA = (nameParam, priceParam) -> new Item(nameParam, priceParam);
        BiFunction<String, Double, Item> biFunctionB = Item::new;
        // se toma el constructor con dos parametro
        // el metodo constructor new tiene un parametro de tipo String y otro parametro de tipo double
        // el metodo apply recibe dos parametros (String y Double) y retorna un objeto Item
        Item itemB = biFunctionB.apply(nameArg, priceArg);

        System.out.println("BiFunction A: "+ biFunctionA.apply(nameArg, priceArg));
        System.out.println("BiFunction B: " + itemB);
    }
}
