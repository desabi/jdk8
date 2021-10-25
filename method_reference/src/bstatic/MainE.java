package bstatic;

import java.util.function.BiFunction;

public class MainE {
    public static void main(String[] args) {

        Integer intArgA = 34;
        Integer intArgB = 23;

        // lambda expression
        BiFunction<Integer, Integer, Integer> biFunctionA =
                (intParamA, intParamB) -> Integer.sum(intParamA, intParamB);

        // method reference
        BiFunction<Integer, Integer, Integer> biFunctionB = Integer::sum;

        System.out.println("La suma es: " + biFunctionA.apply(intArgA, intArgB));
        System.out.println("La suma es: " + biFunctionB.apply(intArgA, intArgB));

        // El método que va después de los dos puntos (::sum)
        // debe poder procesar los parámetros de entrada
        // que se van a pasar al llamar al método (apply).

    }
}
