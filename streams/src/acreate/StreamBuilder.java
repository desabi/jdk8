package acreate;

import util.Employee;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {
        System.out.println("=== Stream Builder ===");

        Stream.Builder<Employee> employeeStreamBuilder = Stream.builder();

        employeeStreamBuilder.accept(new Employee(1, "Jeff Bezos", 100000.0));
        employeeStreamBuilder.accept(new Employee(2, "Bill Gates", 200000.0));
        employeeStreamBuilder.accept(new Employee(3, "Mark Zuckerberg", 300000.0));

        Stream<Employee> employeeStream = employeeStreamBuilder.build();

        employeeStream.forEach(System.out::println);
    }
}
