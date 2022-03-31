package filter;

import java.util.Optional;
import java.util.function.Predicate;

public class YearIsPresent {
    public static void main(String[] args) {

        Integer year = 2022;

        Optional<Integer> optionalYear = Optional.of(year);

        //Predicate<Integer> predicate = yearParam -> yearParam == 2022;

        // como lo compara con el 2022? yearParam?
        Optional<Integer> optionalYearFilter = optionalYear.filter(yearParam -> yearParam == 2022);
        System.out.println("optionalYearFilter = " + optionalYearFilter); //Optional[2022]
        System.out.println("2022 is present :" + optionalYearFilter.isPresent()); // true

        System.out.println("##########################################");
        boolean isPresent2022 = optionalYear.filter(yearParam -> yearParam == 2021).isPresent();
        // if the predicate returns false, then it will return an empty Optional:
        System.out.println(optionalYear.filter(yearParam -> yearParam == 2021)); //Optional.empty
        System.out.println("isPresent2022 = " + isPresent2022);

    }
}
