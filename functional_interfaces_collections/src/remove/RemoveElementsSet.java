package remove;

import java.util.Set;
import java.util.TreeSet;

public class RemoveElementsSet {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Jeremy");
        names.add("Javier");
        names.add("Rose");

        names.removeIf(name -> name.charAt(0) == 'J');
        names.forEach(System.out::println);
    }
}
