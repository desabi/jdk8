package objecttostream;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListToStream {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("RED", "GREEN", "BLUE");

        // any collection can be converted to stream
        colors.stream()
                .filter(color -> color.equals("GREEN"))
                .forEach(System.out::println);


    }
}
