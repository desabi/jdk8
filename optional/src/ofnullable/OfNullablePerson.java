package ofnullable;

import java.util.Optional;

public class OfNullablePerson {
    public static void main(String[] args) {

        Person emptyPerson = new Person();
        Person nullPerson = null;

        System.out.println("OfNullable empty person: " + Optional.ofNullable(emptyPerson));
        System.out.println("OfNullable null person: " + Optional.ofNullable(nullPerson));

        Optional<Person> optionalEmptyPerson = Optional.ofNullable(emptyPerson);
        Optional<Person> optionalNullPerson = Optional.ofNullable(nullPerson);

        System.out.println("Empty person is present: " + optionalEmptyPerson.isPresent());
        System.out.println("Null person is present: " + optionalNullPerson.isPresent());
    }
}
