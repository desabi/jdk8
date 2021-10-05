package cdefaultprivate;

public class Receipt {
    String item;
    Double price;
    Double discount;
    double tax;

    public Receipt() {
    }

    public Receipt(String item, Double price, Double discount, double tax) {
        this.item = item;
        this.price = price;
        this.discount = discount;
        this.tax = tax;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "item='" + item + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", tax=" + tax +
                '}';
    }
}
