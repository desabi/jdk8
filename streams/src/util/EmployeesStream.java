package util;

import java.util.stream.Stream;

public class EmployeesStream {

    public static Stream<Employee> get() {
        return Stream.of(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );
    }

}
