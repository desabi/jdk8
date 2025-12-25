package generators.store;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StoreGenerator {
    // Arrays of sample data for generating realistic random values
    private static final String[] CITIES = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", 
                                           "Philadelphia", "San Antonio", "San Diego", "Dallas", "Seattle"};
    
    private static final String[] PRODUCT_NAMES = {"Laptop", "Smartphone", "Tablet", "Headphones", 
                                                   "Monitor", "Keyboard", "Mouse", "Printer", "Router", "Smartwatch"};
    
    private static final String[] CATEGORIES = {"Electronics", "Computers", "Mobile", "Accessories", "Home Appliances"};
    
    private static final String[] FIRST_NAMES = {"John", "Jane", "Robert", "Emily", "Michael", 
                                                "Sarah", "David", "Lisa", "James", "Maria"};
    
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Brown", "Jones", 
                                               "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};

    /**
     * Generates a list of random products
     * @param size number of products to generate
     * @return List of random Product objects
     */
    private static List<Product> generateRandomProducts(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> {
                    String productId = "PROD-" + (1000 + i);
                    String name = PRODUCT_NAMES[ThreadLocalRandom.current().nextInt(PRODUCT_NAMES.length)];
                    String category = CATEGORIES[ThreadLocalRandom.current().nextInt(CATEGORIES.length)];
                    double price = ThreadLocalRandom.current().nextDouble(50, 2000);
                    int stockQuantity = ThreadLocalRandom.current().nextInt(0, 100);
                    
                    return new Product(productId, name, price, category, stockQuantity);
                })
                .collect(Collectors.toList());
    }

    /**
     * Generates a list of lists containing random sales data
     * @param productList reference list of products for generating valid product IDs
     * @return List of lists where outer list represents days and inner lists represent sales for that day
     */
    private List<List<Sale>> generateRandomSales(List<Product> productList) {
        List<List<Sale>> dailySales = new ArrayList<>();
        
        // Generate sales for 3 days
        for (int day = 0; day < 3; day++) {
            List<Sale> dailySalesList = new ArrayList<>();
            
            // Generate 5 sales for each day
            for (int saleNum = 0; saleNum < 5; saleNum++) {
                // Pick a random product from the product list
                Product randomProduct = productList.get(
                    ThreadLocalRandom.current().nextInt(productList.size())
                );
                
                int quantity = ThreadLocalRandom.current().nextInt(1, 5);
                double totalAmount = randomProduct.getPrice() * quantity;
                
                // Generate random timestamp within the last 30 days
                LocalDateTime timestamp = LocalDateTime.now()
                    .minusDays(ThreadLocalRandom.current().nextInt(30))
                    .minusHours(ThreadLocalRandom.current().nextInt(24))
                    .minusMinutes(ThreadLocalRandom.current().nextInt(60));
                
                String saleId = "SALE-" + (day + 1) + "-" + (saleNum + 1);
                String customerId = generateRandomCustomerId();
                
                dailySalesList.add(new Sale(
                    saleId,
                    randomProduct.getProductId(),
                    quantity,
                    totalAmount,
                    timestamp,
                    customerId
                ));
            }
            
            dailySales.add(dailySalesList);
        }
        
        return dailySales;
    }

    /**
     * Generates a random customer ID
     * @return random customer ID string
     */
    private String generateRandomCustomerId() {
        String firstName = FIRST_NAMES[ThreadLocalRandom.current().nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[ThreadLocalRandom.current().nextInt(LAST_NAMES.length)];
        int customerNumber = ThreadLocalRandom.current().nextInt(1000, 9999);
        return firstName.charAt(0) + lastName + customerNumber;
    }

    /**
     * Generates a list of random stores
     * @param numberOfStores number of stores to generate
     * @return List of randomly generated Store objects
     */
    public static List<Store> generateStores(int numberOfStores) {
        StoreGenerator generator = new StoreGenerator();
        List<Store> stores = new ArrayList<>();
        
        for (int i = 0; i < numberOfStores; i++) {
            String storeId = "STORE-" + (100 + i);
            String city = CITIES[ThreadLocalRandom.current().nextInt(CITIES.length)];
            
            // Generate random products for this store
            List<Product> products = generateRandomProducts(3);
            
            // Generate random sales data for this store
            List<List<Sale>> dailySales = generator.generateRandomSales(products);
            
            // Create and add the store
            Store store = new Store(storeId, city, products, dailySales);
            stores.add(store);
        }
        
        return stores;
    }
}