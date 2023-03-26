package util;

import java.math.BigDecimal;
import java.util.List;

public class ProductsList {

    private ProductsList(){}

    public static List<Product> get() {
        return List.of(
                new Product(1, "Computer", new BigDecimal(24_000), "office"),
                new Product(2, "Mouse", new BigDecimal(300), "accessory"),
                new Product(3, "Keyboard", new BigDecimal(500), "office"),
                new Product(4, "SmartPhone", new BigDecimal(26_000), "personal"),
                new Product(5, "USB Flash", new BigDecimal(1_000), "accessory")
        );
    }
}
