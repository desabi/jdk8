package traversinobject;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Mexico", "USA", "Brazil", "Argentina", "Uruguay");
        countries.iterator().forEachRemaining(c -> System.out.println(c.toUpperCase(Locale.ROOT)));
    }
}
