package ifpresent;

import java.util.Optional;
import java.util.function.Consumer;

public class ifPresenteColor {
    public static void main(String[] args) {

        String colorArg = "Red";    // Optional.of,
        String clothArg = "t-shirt";   // Optional.ofNullable
        String birdArg = null;         // Optional.ofNullable
        String fruit = null;        // Optional.Of, null pointer exception

        // Valor no null: Optional.of
        Optional<String> optionalColor = Optional.of(colorArg);
        System.out.println("optionalColor = " + optionalColor);
        System.out.println("optionalColor.isPresent() = " + optionalColor.isPresent());
        // If a value is present, performs the given action with the value, otherwise does nothing.
        Consumer<String> consumerA = colorParam -> System.out.println(colorParam + " length: " +colorParam.length());
        optionalColor.ifPresent(consumerA);
        System.out.println();

        // Valor no null: Optional.ofNullable
        Optional<String> optionalCloth = Optional.ofNullable(clothArg);
        System.out.println("optionalCloth = " + optionalCloth);
        System.out.println("optionalCloth.isPresent() = " + optionalCloth.isPresent());
        // If a value is present, performs the given action with the value, otherwise does nothing.
        optionalCloth.ifPresent(clothParam -> System.out.println(clothParam + " length: " + clothParam.length()));
        System.out.println();

        // Valor null: Optional.ofNullable
        Optional<String> optionalBird = Optional.ofNullable(birdArg);
        System.out.println("optionalBird = " + optionalBird);
        System.out.println("optionalBird.isPresent() = " + optionalBird.isPresent());
        // If a value is present, performs the given action with the value, otherwise does nothing.
        optionalBird.ifPresent(birdParam -> System.out.println(birdParam + " length: " + birdParam.length()));
        System.out.println();

        // Valor null: Optional.of, throws null pointer exception
        // Optional<String> optionalFruit = Optional.of(fruit);
        // use orElse for default values
    }
}
