package map;

import java.util.Optional;

public class MapOrElseB {
    public static void main(String[] args) {
        // Map: para trabajar con valores que podrían ser null
        // sin hacer verificaciones null explícitas
        String color = "blue";
        String animal = null;

        // Optional.ofNullable(color).map(colorParam -> colorParam.toUpperCase()).orElse("NO COLOR");
        String colorUpperCase = Optional.ofNullable(color).map(String::toUpperCase).orElse("NO COLOR");
        String animalUpperCase = Optional.ofNullable(animal).map(String::toUpperCase).orElse("NO ANIMAL");

        System.out.println("colorUpperCase = " + colorUpperCase); // BLUE
        System.out.println("animalUpperCase = " + animalUpperCase); // NO ANIMAL

    }
}
