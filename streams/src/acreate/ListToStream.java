package acreate;

import util.Employee;

import java.util.Arrays;
import java.util.List;

public class ListToStream {

    private static void colorsList() {
        List<String> colors = Arrays.asList("red", "gree", "blue");

        System.out.println("COLORES-SIN-STREAM");
        // colors.forEach(color -> System.out.println("color = " + color));
        colors.forEach(System.out::println);

        System.out.println("COLORES-CON-STREAM");
        // any collection can be converted to stream
        // Stream<String> stream = colors.stream();
        colors.stream().forEach(System.out::println);
    }

    private static void employeesList() {
        System.out.println("EMPLEADOS-CON-STREAM");
        List<Employee> employeeList
                = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );
        // any collection can be converted to stream
        // Stream<String> stream = employeeList.stream();
        employeeList.stream().forEach(System.out::println);

        System.out.println("EMPLEADOS-SIN-STREAM");
        employeeList.forEach(employee -> System.out.println(employee));
    }

    public static void main(String[] args) {
        System.out.println("=== List to Stream ===");
        colorsList();
        employeesList();
    }
}
