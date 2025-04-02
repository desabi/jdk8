package util.generator.person;

import java.util.List;

public class PersonMain {

  public static void main(String[] args) {
    List<Person> people = PersonGenerator.generateRandomPersons();
    people.forEach(System.out::println);
  }
}
