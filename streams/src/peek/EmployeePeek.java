package peek;

import util.Employee;
import util.EmployeesList;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeePeek {

    // peek: to perform multiple operations on each element of the stream
    // returns a new stream which can be used further.
    // before any terminal operation is applied.

    public static void main(String[] args) {
        List<Employee> employees = EmployeesList.get();

        employees.stream()
                .peek(employee -> employee.salaryIncrement(10.0))
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
