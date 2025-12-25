package generators.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductGenerator {
    
    private static final Random random = new Random();
    private static final String[] PRODUCT_NAMES = {
        "Laptop", "Smartphone", "Headphones", "Monitor", "Keyboard", 
        "Mouse", "Tablet", "Smartwatch", "Camera", "Speaker"
    };
    private static final String[] SUPPLIER_NAMES = {
        "TechSupply Co", "Global Electronics", "Prime Distributors", 
        "FastShip Ltd", "Quality Imports", "DirectSource Inc"
    };
    private static final String[] COUNTRIES = {
        "USA", "China", "Germany", "Japan", "Mexico", "Canada"
    };
    private static final String[] REVIEW_AUTHORS = {
        "John", "Alice", "Bob", "Emma", "Michael", "Sarah", 
        "David", "Lisa", "Tom", "Anna"
    };
    private static final String[] COMMENTS = {
        "Great product!", "Not what I expected", "Excellent quality",
        "Good value for money", "Would buy again", "Disappointing",
        "Perfect!", "Could be better", "Highly recommend", "Average product"
    };
    
    // Private static method to generate a list of 3 random suppliers
    private static List<Supplier> generateSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            suppliers.add(new Supplier(
                SUPPLIER_NAMES[random.nextInt(SUPPLIER_NAMES.length)],
                COUNTRIES[random.nextInt(COUNTRIES.length)],
                random.nextDouble() * 50 + 5, // Shipping cost between 5 and 55
                random.nextInt(20) + 1, // Delivery days between 1 and 20
                random.nextBoolean()
            ));
        }
        return suppliers;
    }
    
    // Private method to generate a list of 3 lists, each containing 4 reviews
    private List<List<Review>> generateReviewsByQuarter() {
        List<List<Review>> reviewsByQuarter = new ArrayList<>();
        for (int quarter = 0; quarter < 3; quarter++) {
            List<Review> quarterReviews = new ArrayList<>();
            for (int review = 0; review < 4; review++) {
                quarterReviews.add(new Review(
                    REVIEW_AUTHORS[random.nextInt(REVIEW_AUTHORS.length)],
                    random.nextInt(5) + 1, // Rating between 1 and 5
                    COMMENTS[random.nextInt(COMMENTS.length)],
                    LocalDate.now().minusDays(random.nextInt(365))
                ));
            }
            reviewsByQuarter.add(quarterReviews);
        }
        return reviewsByQuarter;
    }
    
    // Static method to generate a list of 5 products
    public static List<Product> generateProducts() {
        List<Product> products = new ArrayList<>();
        ProductGenerator generator = new ProductGenerator();
        
        for (int i = 0; i < 5; i++) {
            products.add(new Product(
                PRODUCT_NAMES[random.nextInt(PRODUCT_NAMES.length)],
                random.nextDouble() * 1000 + 100, // Price between 100 and 1100
                generator.generateReviewsByQuarter(),
                generateSuppliers()
            ));
        }
        return products;
    }
}