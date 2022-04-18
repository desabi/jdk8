package max;

import util.Employee;
import util.EmployeesList;

import java.util.Comparator;
import java.util.List;

public class EmployeeMax {
    public static void main(String[] args) {
        List<Employee> employees = EmployeesList.get();

        System.out.println("=== max ===");
        employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

    }
}
