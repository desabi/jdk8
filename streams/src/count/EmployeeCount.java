package count;

import util.Employee;
import util.EmployeesList;

import java.util.List;

public class EmployeeCount {
    public static void main(String[] args) {
        List<Employee> employees = EmployeesList.get();

        long count = employees.stream()
                .filter(employee -> employee.getSalary() > 200000)
                .count();

        System.out.println("count = " + count);
    }
}
