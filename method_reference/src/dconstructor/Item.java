package dconstructor;

public class Item {
    private String name = "Unknow";
    private Double price = 0.0;

    public Item(){
        System.out.println("Constructor Item() called.");
    }

    public Item(String name) {
        this.name = name;
        System.out.println("Constructor Item(String) called.");
    }

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
        System.out.println("Constructor Item(String, Double) called.");
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
