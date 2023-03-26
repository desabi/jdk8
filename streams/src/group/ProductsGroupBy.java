package group;

import util.Product;
import util.ProductsList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductsGroupBy {
    public static void main(String[] args) {
        Map<String, List<Product>> productsByCategory = ProductsList.get().stream()
                .collect(
                        Collectors.groupingBy(
                                product -> product.getCategory()
                        )
                );

        for (Map.Entry<String, List<Product>> entry : productsByCategory.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
    }
}
