package flatmap;

import util.ProductsList;

import java.util.List;
import java.util.stream.Collectors;

public class ProductNames {
    public static void main(String[] args) {
        // map() method is used to apply a function to each element of a Collection
        // and return a new Collection of the computed values.

        // Convert a list of Products to a list of their names. (Flattening)
        List<String> ProductNames = ProductsList.get().stream()
                .map(product -> product.getName())
                .collect(Collectors.toList());

        System.out.println("ProductNames = " + ProductNames);
    }
}
