package generators.product;

import java.util.List;

public class Product {
    private String name;
    private double price;
    private List<Supplier> suppliers; // Suppliers who provide this product
    private List<List<Review>> reviewsByQuarter;

    public Product(String name, double price, List<List<Review>> reviewsByQuarter,
        List<Supplier> suppliers) {
        this.name = name;
        this.price = price;
        this.reviewsByQuarter = reviewsByQuarter;
        this.suppliers = suppliers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"name\": \"").append(name).append("\",\n");
        sb.append("  \"price\": ").append(price).append(",\n");

        // Reviews by quarter
        sb.append("  \"reviewsByQuarter\": [\n");
        for (int i = 0; i < reviewsByQuarter.size(); i++) {
            sb.append("    [\n");
            List<Review> quarterReviews = reviewsByQuarter.get(i);
            for (int j = 0; j < quarterReviews.size(); j++) {
                sb.append("      ").append(quarterReviews.get(j).toString());
                if (j < quarterReviews.size() - 1) sb.append(",");
                sb.append("\n");
            }
            sb.append("    ]");
            if (i < reviewsByQuarter.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("  ],\n");

        // Suppliers
        sb.append("  \"suppliers\": [\n");
        for (int i = 0; i < suppliers.size(); i++) {
            sb.append("    ").append(suppliers.get(i).toString());
            if (i < suppliers.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("  ]\n");
        sb.append("}");

        return sb.toString();
    }
}