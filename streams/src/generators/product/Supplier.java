package generators.product;

class Supplier {
    private String name;
    private String country;
    private double shippingCost;
    private int deliveryDays;
    private boolean isPreferred;

    public Supplier(String name, String country, double shippingCost, int deliveryDays,
        boolean isPreferred) {
        this.name = name;
        this.country = country;
        this.shippingCost = shippingCost;
        this.deliveryDays = deliveryDays;
        this.isPreferred = isPreferred;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getDeliveryDays() {
        return deliveryDays;
    }

    public void setDeliveryDays(int deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public boolean isPreferred() {
        return isPreferred;
    }

    public void setPreferred(boolean preferred) {
        isPreferred = preferred;
    }

    @Override
    public String toString() {
        return "{\n" +
            "    \"name\": \"" + name + "\",\n" +
            "    \"country\": \"" + country + "\",\n" +
            "    \"shippingCost\": " + shippingCost + ",\n" +
            "    \"deliveryDays\": " + deliveryDays + ",\n" +
            "    \"isPreferred\": " + isPreferred + "\n" +
            "  }";
    }
}