package filter;

public class Modem {
    private Double price;

    public Modem(Double price) {
        this.price = price;
        System.out.println("******\n"+this);
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Modem{" +
                "price=" + price +
                '}';
    }
}
