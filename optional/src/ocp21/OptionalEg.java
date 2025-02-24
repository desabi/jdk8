package ocp21;

import java.sql.SQLOutput;
import java.util.Optional;
import javax.swing.text.html.Option;

public class OptionalEg {
  public static void main(String[] args) {
    basicUse();
    checkValue();
    ifPresent();
    orElse();
    orElseThrow();
    orElseWhenValuePresent();
  }

  static void basicUse() {
    System.out.println("********** basic use **********");
    System.out.println(average(90, 100));
    System.out.println(average());
  }

  /**
   *
   */
  static void checkValue() {
    System.out.println("********** check value **********");
    Optional<Double> optionalAverage = average(90, 100);

    // optionalAverage.ifPresent(System.out::println);
    if (optionalAverage.isPresent()) {
      System.out.println(optionalAverage.get());
    }
  }

  /**
   * When creating an Optional, it is common to want to use empty() when the value is null.
   * You can do this with an if statement or ternary operator.
   */
  static void ternaryOperator(String value) {
    Optional<String> optional1 = (value == null) ? Optional.empty() : Optional.of(value);

    // since this is such a common pattern, Java provides a factory method to do the same thing
    Optional<String> optional2 = Optional.ofNullable(value);
  }

  // The other methods allow you to write code that uses an Optional in one line without having to
  // use the ternary operator.

  /**
   * Instead of using an if statement, we can specify a consumer to be run when there is a value
   * inside the optional. When there is not, the method simply skips running the consumer.
   * Think of it as an if statement with no else.
   */
  static void ifPresent() {
    System.out.println("********** if present **********");
    Optional<Double> optionalAverage1 = average(90, 100);
    optionalAverage1.ifPresent(System.out::println);

    System.out.println("---");
    Optional<Double> optionalAverage2 = average();
    optionalAverage2.ifPresent(System.out::println);
  }

  /**
   * Specify what to do if a value is not present.
   */
  static void orElse() {
    System.out.println("********** or else **********");
    Optional<Double> optionalAverage1 = average();
    // specify a return value directly
    System.out.println(optionalAverage1.orElse(Double.NaN));
    // use a supplier
    System.out.println(optionalAverage1.orElseGet(() -> Math.random()));

    System.out.println("---");
    // when the value is present
    Optional<Double> optionalAverage2 = average(90, 100);
    System.out.println(optionalAverage2.orElse(Double.NaN)); // prints 95
    System.out.println(optionalAverage2.orElseGet(Math::random)); // prints 95
  }

  static void orElseThrow() {
    System.out.println("********** exceptions **********");
    Optional<Double> optionalAverage1 = average();
    //System.out.println(optionalAverage1.orElseThrow()); // NoSuchElementException
    System.out.println(optionalAverage1.orElseThrow(() -> new IllegalStateException()));
  }

  /**
   * It prints out 95.0 three times. Since the value does exist, there is no need to use the
   * "or else" logic.
   */
  private static void orElseWhenValuePresent() {
    System.out.println("********** or else when value is present **********");
    Optional<Double> average = average(90, 50);
    System.out.println(average.orElse(Double.NaN));
    System.out.println(average.orElseGet(Math::random));
    System.out.println(average.orElseThrow());
  }

  static Optional<Double> average(int... scores) {
    if (scores.length == 0) {
      return Optional.empty();
    }

    int sum = 0;
    for (int score: scores) {
      sum += score;
    }

    double average = (double) sum / scores.length;

    return Optional.of(average);
  }
}
