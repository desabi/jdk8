package conversion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLegths {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("smartphone", "server", "laptop", "mouse", "keyboard");

        //  convert a Collection to another Collection.
        //  Create a Map from a List: convert a list of strings to a map of string and length
        Map<String, Integer> wordAndLengths = words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        String::length)
                );

        System.out.println("wordAndLengths = " + wordAndLengths);
    }
}
