package generators.store;

// Custom class for Product
class Product {
    private String productId;
    private String name;
    private double price;
    private String category;
    private int stockQuantity;
    
    // Constructor, getters, setters...

    public Product(String productId, String name, double price, String category,
        int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return String.format(
            "{\"productId\":\"%s\",\"name\":\"%s\",\"price\":%.2f,\"category\":\"%s\",\"stockQuantity\":%d}",
            productId, name, price, category, stockQuantity
        );
    }
}