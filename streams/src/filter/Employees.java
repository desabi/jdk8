package filter;

import util.Employee;
import util.EmployeeRepository;
import util.EmployeesList;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employees {
    public static void main(String[] args) {
        System.out.println("=== filter ===");

        Integer[] ids = {1, 2, 3, 4};
        EmployeeRepository employeeRepository = new EmployeeRepository(EmployeesList.get());

        Function<Integer, Employee> function = id -> employeeRepository.findById(id);

        List<Employee> collect = Stream.of(ids)
                .map(function)
                //.map(id -> employeeRepository.findById(id))
                //.map(employeeRepository::findById)
                .filter(employee -> employee != null)
                .filter(employee -> employee.getSalary() > 200000)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
