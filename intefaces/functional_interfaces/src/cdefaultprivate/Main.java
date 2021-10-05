package cdefaultprivate;

public class Main {
    public static void main(String[] args) {

        ReceiptPrinter simpleReceiptPrinter = new ReceiptPrinter() {
            @Override
            public void print(Receipt receipt) {
                System.out.println("Item: " + receipt.item);
                System.out.println("Price: " + receipt.price);
                System.out.println("Discount: " + receipt.discount);
                System.out.println("Tax: " + receipt.tax);
                System.out.println("Total: " + computeTotal(receipt));
            }
        };

        ReceiptPrinter exemptReceiptPrinter = new ReceiptPrinter() {
            @Override
            public void print(Receipt receipt) {
                System.out.println("Item: " + receipt.item);
                System.out.println("Price: " + receipt.price);
                System.out.println("Discount: " + receipt.discount);
                System.out.println("Tax: " + receipt.tax);
                System.out.println("Total: " + computeTotal(receipt));
            }

            @Override
            public Double computeTotal(Receipt receipt) {
                return receipt.price - (receipt.price * receipt.discount);
            }
        };

        Receipt receipt = new Receipt("Shirt", 20.0, 0.05, 0.07);
        simpleReceiptPrinter.print(receipt);
        System.out.println();
        exemptReceiptPrinter.print(receipt);
    }
}
