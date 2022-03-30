package remove;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Super");
        list.add("Random");
        list.add("Silly");
        list.add("Data");

        // removing all elements beginning with S
        list.removeIf(x -> x.charAt(0) == 'S');

        list.forEach(x -> System.out.println(x));
        System.out.println("------------------");
        list.forEach(System.out::println);
    }
}
