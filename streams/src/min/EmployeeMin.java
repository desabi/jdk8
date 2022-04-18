package min;

import util.Employee;
import util.EmployeesList;

import java.util.Comparator;
import java.util.List;

public class EmployeeMin {
    public static void main(String[] args) {
        List<Employee> employees = EmployeesList.get();

        System.out.println("=== min ===");
        employees.stream()
                .min(Comparator.comparing(Employee::getId))
                .ifPresent(System.out::println);
    }
}
