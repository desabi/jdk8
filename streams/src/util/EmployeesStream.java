package util;

import java.util.stream.Stream;

public class EmployeesStream {

    public static Stream<Employee> get() {
        return Stream.of(
                new Employee(1, "Larry Page", 100_000.0),
                new Employee(2, "Jeff Bezos", 200_000.0),
                new Employee(3, "Bill Gates", 300_000.0),
                new Employee(4, "Mark Zuckerberg", 400_000.0),
                new Employee(5, "Elon Musk", 500_000.0)
        );
    }

}
