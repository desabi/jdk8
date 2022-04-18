package map;

import util.Employee;
import util.EmployeeRepository;
import util.EmployeesList;
import util.EmployeesStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegersToEmployees {
    public static void main(String[] args) {
        System.out.println("=== map ===");
        EmployeeRepository employeeRepository = new EmployeeRepository(EmployeesList.get());

        // map() produces a new stream after applying a function
        // to each element of the original stream.
        // The new stream could be of different type.
        Integer[] ids = {1, 3};

        List<Employee> collect = Stream.of(ids)
                .map(employeeRepository::findById)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
