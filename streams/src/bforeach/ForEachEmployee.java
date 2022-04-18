package bforeach;

import util.Employee;
import util.EmployeesStream;

import java.util.stream.Stream;

public class ForEachEmployee {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = EmployeesStream.get();

        // the method forEach is a terminal operation
       employeeStream.forEach(employee -> employee.salaryIncrement(10.0));

    }
}
