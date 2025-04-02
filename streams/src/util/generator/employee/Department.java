package util.generator.employee;

import java.util.List;
import java.util.ArrayList;

public class Department {
    private List<Employee> employees;

    // Constructor
    public Department() {
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Get all employees in the department
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < employees.size(); i++) {
            sb.append(employees.get(i).toString());
          if (i < employees.size() - 1) {
            sb.append(", ");
          }
        }
        sb.append("]");
        return sb.toString();
    }
}