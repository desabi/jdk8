package map.filter.findfirst;

import util.Employee;
import util.EmployeeRepository;
import util.EmployeesList;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstEmployee {
    public static void main(String[] args) {
        System.out.println("=== find first ===");
        EmployeeRepository employeeRepository = new EmployeeRepository(EmployeesList.get());
        Integer[] ids = {1, 2, 3, 4};

        Optional<Employee> firstEmployee = Stream.of(ids)
                .map(employeeRepository::findById)
                .filter(employee -> employee != null)
                .filter(employee -> employee.getSalary() > 400000)
                .findFirst();

        firstEmployee.ifPresent(System.out::println);
    }
}
