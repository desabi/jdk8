package map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapOrElseA {
    public static void main(String[] args) {
        // Map: para trabajar con valores que podrían ser null
        // sin hacer verificaciones null explícitas
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");

        Optional<List<String>> optionalCompanyNames = Optional.ofNullable(companyNames);
        Integer listSize = optionalCompanyNames.map(List::size).orElse(0);

        System.out.println("listSize = " + listSize);
    }
}
