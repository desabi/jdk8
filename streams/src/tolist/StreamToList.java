package tolist;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {

        // convert stream to list
        // java 8
        List<String> isoCountriesListA = Stream.of(Locale.getISOCountries()).collect(Collectors.toList());
        // java 16
        List<String> isoCountriesListB = Stream.of(Locale.getISOCountries()).toList();

        isoCountriesListA.forEach(System.out::print);
        System.out.println();
        isoCountriesListB.forEach(System.out::print);

    }
}
