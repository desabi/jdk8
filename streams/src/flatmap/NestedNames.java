package flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NestedNames {

    // A stream can hold complex data structures like Stream<List<String>>.
    // In cases like this, flatMap() helps us to flatten the data structure
    // to simplify further operations:
    public static void main(String[] args) {
        System.out.println("=== flat map ===");
        
        // List<String>
        List<String> personOne = Arrays.asList("Jeff", "Bezos");
        List<String> personTwo = Arrays.asList("Bill", "Gates");
        List<String> personThree = Arrays.asList("Mark", "Zuckerberg");

        // List<List<String>>
        List<List<String>> nestedNames = Arrays.asList(personOne, personTwo, personThree);

        // Stream<List<String>> to a simpler Stream<String>
        List<String> collect = nestedNames.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
