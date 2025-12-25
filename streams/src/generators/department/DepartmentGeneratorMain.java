package generators.department;

import java.util.List;

public class DepartmentGeneratorMain {

  public static void main(String[] args) {

    List<Department> departments = DepartmentGenerator.generateDepartments();
    departments.forEach(System.out::println);

    // // challenges to solve on departments list
  }

}
