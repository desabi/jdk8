package map;

import util.Employee;
import util.EmployeeRepository;
import util.EmployeesList;
import util.EmployeesStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegersToEmployees {

    public static void main(String[] args) {
        System.out.println("=== map ===");

        Integer[] ids = {1, 3};
        EmployeeRepository employeeRepository = new EmployeeRepository(EmployeesList.get());

        // Function<Integer, Employee> function = id -> employeeRepository.findById(id);
        Function<Integer, Employee> function = employeeRepository::findById;
        // System.out.println("function.apply(2) = " + function.apply(2));
        // function.apply(2) = Employee{id=2, name='Bill Gates', salary=200000.0}

        // map() produces a new stream after applying a function to each element of the original stream.
        // The new stream could be of different type.
        List<Employee> collect = Stream.of(ids)
                .map(function)
                //.map(id -> employeeRepository.findById(id))
                //.map(employeeRepository::findById)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
