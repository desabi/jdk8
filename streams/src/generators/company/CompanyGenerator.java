package generators.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CompanyGenerator {

  private static final Random RANDOM = new Random();
  private static final List<String> EMPLOYEE_NAMES = Arrays.asList(
      "Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona", "George", "Hannah"
  );
  private static final List<String> DEPARTMENTS = Arrays.asList(
      "IT", "HR", "Finance", "Marketing", "Sales"
  );
  private static final List<String> PROJECT_TITLES = Arrays.asList(
      "Apollo", "Zephyr", "Orion", "Titan", "Nova", "Pegasus", "Atlas"
  );

  // 🔹 Private static method: generates 5 random employees
  private static List<Employee> generateEmployees() {
    List<Employee> employees = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      String name = EMPLOYEE_NAMES.get(RANDOM.nextInt(EMPLOYEE_NAMES.size()));
      int age = 20 + RANDOM.nextInt(25); // age between 20–45
      String department = DEPARTMENTS.get(RANDOM.nextInt(DEPARTMENTS.size()));
      employees.add(new Employee(name, age, department));
    }
    return employees;
  }

  // 🔹 Private method: generates 2 lists of 4 random projects each
  private List<List<Project>> generateProjects() {
    List<List<Project>> projectGroups = new ArrayList<>();
    for (int i = 0; i < 2; i++) {
      List<Project> projects = new ArrayList<>();
      for (int j = 0; j < 4; j++) {
        String title = PROJECT_TITLES.get(RANDOM.nextInt(PROJECT_TITLES.size()));
        double budget = 1000 + RANDOM.nextInt(9000); // budget between 1k–10k
        boolean completed = RANDOM.nextBoolean();
        projects.add(new Project(title, budget, completed));
      }
      projectGroups.add(projects);
    }
    return projectGroups;
  }

  // 🔹 Static method: generates 4 Companies
  public static List<Company> generateCompanies() {
    List<Company> companies = new ArrayList<>();
    CompanyGenerator generator = new CompanyGenerator();

    for (int i = 0; i < 4; i++) {
      String companyName = "Company-" + (i + 1);
      int foundedYear = 1980 + RANDOM.nextInt(40); // between 1980–2020
      List<Employee> employees = generateEmployees();
      List<List<Project>> projects = generator.generateProjects();

      companies.add(new Company(companyName, foundedYear, employees, projects));
    }
    return companies;
  }
}
