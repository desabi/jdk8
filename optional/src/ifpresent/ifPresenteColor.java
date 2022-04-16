package ifpresent;

import java.util.Optional;

public class ifPresenteColor {
    public static void main(String[] args) {

        String color = "Red";       // Optional.of,
        String cloth = "t-shirt";   // Optional.ofNullable
        String bird = null;         // Optional.ofNullable
        String fruit = null;        // Optional.Of, null pointer exception

        // Valor no null: Optional.of
        Optional<String> optionalColor = Optional.of(color);
        optionalColor.ifPresent(colorParam -> System.out.println(colorParam + " length: " +colorParam.length()));

        // Valor no null: Optional.ofNullable
        Optional<String> optionalCloth = Optional.ofNullable(cloth);
        optionalCloth.ifPresent(clothParam -> System.out.println(clothParam + " length: " + clothParam.length()));

        // Valor null: Optional.ofNullable
        Optional<String> optionalBird = Optional.ofNullable(bird);
        optionalBird.ifPresent(birdParam -> System.out.println(birdParam + " length: " + birdParam.length()));

        // Valor null: Optional.of, null pointer exception
        // Optional<String> optionalFruit = Optional.of(fruit);

        // use orElse for default values
    }
}
