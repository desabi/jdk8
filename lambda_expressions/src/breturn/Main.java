package breturn;

public class Main {
    public static void main(String[] args) {

        String nameArgument = "abi";

        Greet greet1 = nameParameter -> "Hello " + nameParameter;

        String fullMessage1 = greet1.getMessage(nameArgument);
        System.out.println(fullMessage1);

        System.out.println(greet1.getMessage(nameArgument));

        Greet greet2 = nameParameter -> {
            String fullMessage2 = "Hello: " + nameParameter + ", Good Day.";
            fullMessage2 = fullMessage2.toUpperCase();
            return fullMessage2;
        };

        String fullMessage2 = greet2.getMessage(nameArgument);
        System.out.println(fullMessage2);

        System.out.println(greet2.getMessage(nameArgument));
    }
}
