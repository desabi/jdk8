package ofnullable;

import java.util.Optional;

public class OfNullableWords {
    public static void main(String[] args) {
        String[] words = new String[10];

        Optional<String> optionalWord = Optional.ofNullable(words[5]);

        if (optionalWord.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.println(word);

            // uso de get
            String theWord = optionalWord.get();
            System.out.println(theWord);
        } else {
            System.out.println("word is null");
        }
    }
}
