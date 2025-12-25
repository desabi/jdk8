package generators.store;

import java.time.LocalDateTime;

// Custom class for Sale
class Sale {
    private String saleId;
    private String productId;
    private int quantity;
    private double totalAmount;
    private LocalDateTime timestamp;
    private String customerId;
    
    // Constructor, getters, setters...

    public Sale(String saleId, String productId, int quantity, double totalAmount,
        LocalDateTime timestamp, String customerId) {
        this.saleId = saleId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.timestamp = timestamp;
        this.customerId = customerId;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return String.format(
            "{\"saleId\":\"%s\",\"productId\":\"%s\",\"quantity\":%d,\"totalAmount\":%.2f,\"timestamp\":\"%s\",\"customerId\":\"%s\"}",
            saleId, productId, quantity, totalAmount, timestamp, customerId
        );
    }
}