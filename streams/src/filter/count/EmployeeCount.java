package filter.count;

import util.Employee;
import util.EmployeesList;
import util.EmployeesStream;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeCount {
    public static void main(String[] args) {
        List<Employee> employeesList = EmployeesList.get();
        Stream<Employee> employeeStream = EmployeesStream.get();

        long countList = employeesList.stream()
                .filter(employee -> employee.getSalary() > 200_000)
                .count();

        long countStream = employeeStream
                .filter(e -> e.getSalary() > 200_000)
                .count();

        System.out.println("countList = " + countList);
        System.out.println("countStream = " + countStream);
    }
}
