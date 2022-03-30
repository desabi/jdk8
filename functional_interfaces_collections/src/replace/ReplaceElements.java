package replace;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ReplaceElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(16, 12, 8, 4);

        Function<Integer, Integer> functionA = number -> number/4;
        UnaryOperator<Integer> operation = number -> number/4;

        // 16/4, 12/4, 8/4, 4/4
        numbers.replaceAll(operation);
        numbers.forEach(System.out::println);

        System.out.println("--------------------------");

        List<String> animals = Arrays.asList("Dog", "Cat", "Horse", "Whale", "Bird");

        // add quotes and transform to upper case
        Function<String, String> functionB = animal -> ("\""+animal+"\"").toUpperCase(Locale.ROOT);
        UnaryOperator addQuotesAndUpperCase = animal -> ("\""+animal+"\"").toUpperCase(Locale.ROOT);

        animals.replaceAll(addQuotesAndUpperCase);
        animals.forEach(System.out::println);
    }
}
