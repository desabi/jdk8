package ocp21;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BTerminalOperations {
  public static void main(String[] args) {
    //count();
    //minMax();
    //find();
    //match();
    //iterating();
  }

  static void count() {
    // count
    Stream<String> animals1 = Stream.of("monkey", "gorilla", "bonobo");
    System.out.println("Total animals: " + animals1.count());
  }

  static void minMax() {
    // min: find the animal with the fewer letters in his name
    Stream<String> animals2 = Stream.of("monkey", "ape", "bonobo");
    Optional<String> min = animals2.min((animalA, animalB) -> animalA.length() - animalB.length());
    //Optional<String> minReduced = animals2.min(Comparator.comparingInt(String::length));
    min.ifPresent(System.out::println);

    // max:
    Stream<String> animals3 = Stream.of("monkey", "gorilla", "bonobo");
    Optional<String> max = animals3.max((animalA, animalB) -> animalA.length() - animalB.length());
    max.ifPresent(System.out::println);

    Optional<?> minEmpty = Stream.empty().min((animalA, animalB) -> 0);
    System.out.println(minEmpty.isPresent());
  }

  static void find() {
    // findAny
    Stream<String> mammals = Stream.of("monkey", "gorilla", "bonobo");
    Stream<String> infinite = Stream.generate(() -> "chimp");
    mammals.findAny().ifPresent(System.out::println); // monkey, usually
    infinite.findAny().ifPresent(System.out::println); // chimp
  }

  static void match() {
    var apes = List.of("monkey", "2", "chimp");
    Stream<String> infinite = Stream.generate(() -> "chimp");
    Predicate<String> predicate = animal -> Character.isLetter(animal.charAt(0));

    // two of three elements match
    System.out.println("anyMatch(): " + apes.stream().anyMatch(predicate)); // true
    // one does not match
    System.out.println("allMatch(): " + apes.stream().allMatch(predicate)); // false
    // at least one matches
    System.out.println("noneMatch(): " + apes.stream().noneMatch(predicate)); // false
    // we match right away and the call terminates
    System.out.println("infinite, anyMatch(): " + infinite.anyMatch(predicate));

    // never terminates, because all matches need to check every element,
    // it will run until we kill the program
    Stream<String> infinite2 = Stream.generate(() -> "chimp");
    //System.out.println("infinite, allMatch(): " + infinite2.allMatch(predicate));
  }

  static void iterating() {
    Stream<String> mammals = Stream.of("monkey", "gorilla", "bonobo");
    mammals.forEach(System.out::println);
  }

  static void reducing() {

  }
}
