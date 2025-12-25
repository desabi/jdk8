package generators.store;

import java.util.List;
import java.util.stream.Collectors;

class Store {
    private String storeId;
    private String city;
    private List<Product> products;
    private List<List<Sale>> dailySales;
    
    public Store(String storeId, String city, List<Product> products, List<List<Sale>> dailySales) {
        this.storeId = storeId;
        this.city = city;
        this.products = products;
        this.dailySales = dailySales;
    }
    
    // Getters
    public String getStoreId() { return storeId; }
    public String getCity() { return city; }
    public List<Product> getProducts() { return products; }
    public List<List<Sale>> getDailySales() { return dailySales; }
    
    // Setters if needed
    public void setStoreId(String storeId) { this.storeId = storeId; }
    public void setCity(String city) { this.city = city; }
    public void setProducts(List<Product> products) { this.products = products; }
    public void setDailySales(List<List<Sale>> dailySales) { this.dailySales = dailySales; }

    @Override
    public String toString() {
        // Convert products list to JSON array
        String productsJson = products.stream()
            .map(Product::toString)
            .collect(Collectors.joining(", ", "[", "]"));

        // Convert dailySales (list of lists) to JSON array of arrays
        String salesJson = dailySales.stream()
            .map(daySales -> daySales.stream()
                .map(Sale::toString)
                .collect(Collectors.joining(", ", "[", "]")))
            .collect(Collectors.joining(", ", "[", "]"));

        return String.format(
            "{\"storeId\":\"%s\",\"city\":\"%s\",\"products\":%s,\"dailySales\":%s}",
            storeId, city, productsJson, salesJson
        );
    }
}