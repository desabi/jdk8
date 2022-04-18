package collect;

import util.Employee;
import util.EmployeesList;

import java.util.List;
import java.util.stream.Collectors;

public class CollectEmployees {
    public static void main(String[] args) {

        System.out.println("=== collect ===");
        List<Employee> employees = EmployeesList.get();
        List<Employee> employeesCollect = employees.stream().collect(Collectors.toList());

        System.out.println("employees = " + employees);
        System.out.println("employeesCollect = " + employeesCollect);

    }
}
