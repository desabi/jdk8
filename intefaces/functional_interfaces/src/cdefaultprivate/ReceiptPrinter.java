package cdefaultprivate;

public interface ReceiptPrinter {
    void print(Receipt receipt);

    // java 9 - private method
    private Double getDiscounterPrice(Receipt receipt){
        return receipt.price - (receipt.price * receipt.discount);
    }

    default Double computeTotal(Receipt receipt){
        Double discounterPrice = getDiscounterPrice(receipt);
        return discounterPrice + (discounterPrice * receipt.tax);
    }
}
