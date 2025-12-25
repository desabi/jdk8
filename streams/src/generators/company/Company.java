package generators.company;

import java.util.List;

public class Company {

    // First field: company name
    private String name;

    // Second field: year founded
    private int foundedYear;

    // A List of a custom object/class: Employee
    private List<Employee> employees;

    // A List of Lists: each inner list contains Project objects
    private List<List<Project>> projects;

    // Constructors, getters, setters, etc.

    public Company(String name, int foundedYear, List<Employee> employees,
        List<List<Project>> projects) {
        this.name = name;
        this.foundedYear = foundedYear;
        this.employees = employees;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<List<Project>> getProjects() {
        return projects;
    }

    public void setProjects(List<List<Project>> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return String.format(
            "{ \"name\": \"%s\", \"foundedYear\": %d, \"employees\": %s, \"projects\": %s }",
            name, foundedYear, employees, projects
        );
    }

}
