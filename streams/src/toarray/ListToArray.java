package toarray;

import util.Employee;
import util.EmployeesList;

import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        System.out.println("=== to array ===");

        List<Employee> employeesList = EmployeesList.get();

        Employee[] employeesArray = employeesList.stream().toArray(Employee[]::new);

        System.out.println("employeesArray.length = " + employeesArray.length);
    }
}
