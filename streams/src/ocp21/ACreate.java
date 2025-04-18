package ocp21;

import java.util.List;
import java.util.stream.Stream;

/**
 * - Stream.empty()
 * - Stream.of()
 * - collection.stream()
 * - Stream.generate(supplier)
 * - Stream.iterate(seed, unaryOperator)
 * - Stream.iterate(seed, predicate, unaryOperator)
 */
public class ACreate {
  public static void main(String[] args) {
    finite();
    infinite();
  }

  static void finite() {
    Stream<String> empty = Stream.empty();
    Stream<Integer> singleElement = Stream.of(1);
    Stream<Integer> fromArray = Stream.of(1, 2, 3);

    var list = List.of("a", "b", "c");
    Stream<String> fromList = list.stream();

    System.out.println("Empty: " + empty);
    System.out.println("Single Element: " + singleElement);
  }

  static void infinite() {
    // the source does not actually create the values until you call a terminal operation.
    Stream<Double> randoms = Stream.generate(Math::random);

    // it will keep on producing odd numbers as long as you need them.
    Stream<Integer> oddNumber = Stream.iterate(1, number -> number + 2);

    // add number less than 100 (finite)
    Stream<Integer> oddNumbersUnder100 = Stream.iterate(
        1,                  // seed
        number -> number < 100,  // predicate to specify when done
        number -> number + 2     // UnaryOperator to het next value
    );

  }
}
