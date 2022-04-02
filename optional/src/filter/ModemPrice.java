package filter;

import java.util.Optional;

public class ModemPrice {
    public static void main(String[] args) {

        // without optional filter
        System.out.println(isInRangeA(new Modem(10.0)));
        System.out.println(isInRangeA(new Modem(16.0)));
        System.out.println(isInRangeA(new Modem(null)));
        System.out.println(isInRangeA(null));

        System.out.println("--------------------------------------------------");
        //with optional filter
        System.out.println(isInRangeB(new Modem(10.0)));
        System.out.println(isInRangeB(new Modem(16.0)));
        System.out.println(isInRangeB(new Modem(null)));
        System.out.println(isInRangeB(null));
    }

    // without optional filter
    public static boolean isInRangeA(Modem modem) {
        boolean isInRange = false;

        if (modem != null && modem.getPrice() != null
                && (modem.getPrice() >= 10
                && modem.getPrice() <= 15)) {

            isInRange = true;
        }
        return isInRange;
    }

    // with optional filter
    // if a null object is passed to this method, we don't expect any problem.
    // we can use the filter method to replace unnecessary if statements and reject unwanted values.
    public static boolean isInRangeB(Modem modem) {
        return Optional.ofNullable(modem)
                // used to transform a value to some other value
                // we are obtaining a price object from the Model class.
                .map(Modem::getPrice) // modemParam -> modemParam.getPrice()
                .filter(priceParam -> priceParam >=10)
                .filter(priceParam -> priceParam <=15)
                .isPresent();
    }
}
