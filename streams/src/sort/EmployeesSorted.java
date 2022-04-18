package sort;

import util.Employee;
import util.EmployeesList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesSorted {
    public static void main(String[] args) {
        System.out.println("=== sorted ===");
        List<Employee> employees = EmployeesList.get();

        List<Employee> collect = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);
    }
}
