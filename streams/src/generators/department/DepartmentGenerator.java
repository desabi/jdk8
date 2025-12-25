package generators.department;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DepartmentGenerator {

    private static final Random RANDOM = new Random();
    private static final List<String> MAJORS = Arrays.asList("Computer Science", "Physics", "Mathematics", "Biology");
    private static final List<String> NAMES = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona");

    /**
     * Requirement 1: Private static method for 2 random students
     */
    private static List<Student> generateRandomStudents() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String name = NAMES.get(RANDOM.nextInt(NAMES.size()));
            String major = MAJORS.get(RANDOM.nextInt(MAJORS.size()));
            double gpa = 2.0 + (4.0 - 2.0) * RANDOM.nextDouble(); // Random GPA between 2.0 and 4.0
            int age = 18 + RANDOM.nextInt(7); // Random age between 18 and 25
            
            students.add(new Student(name, age, gpa, major));
        }
        return students;
    }

    /**
     * Requirement 2: Private method for nested ResearchTeams
     * Structure: 3 internal lists, each with 4 teams.
     */
    private List<List<ResearchTeam>> generateResearchProjects() {
        List<List<ResearchTeam>> projects = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) { // 3 internal lists
            List<ResearchTeam> teamsInProject = new ArrayList<>();
            for (int j = 0; j < 4; j++) { // 4 teams per list
                String lead = NAMES.get(RANDOM.nextInt(NAMES.size()));
                List<String> members = Arrays.asList("Member_" + RANDOM.nextInt(100), "Member_" + RANDOM.nextInt(100));
                teamsInProject.add(new ResearchTeam(lead, members));
            }
            projects.add(teamsInProject);
        }
        return projects;
    }

    /**
     * Requirement 3: Static method to generate 5 Departments
     */
    public static List<Department> generateDepartments() {
        List<Department> departments = new ArrayList<>();
        DepartmentGenerator generator = new DepartmentGenerator(); // Needed to call the non-static method

        for (int i = 1; i <= 5; i++) {
            String deptName = "Dept-" + i;
            String deanName = "Dean-" + NAMES.get(RANDOM.nextInt(NAMES.size()));
            
            List<Student> students = generateRandomStudents();
            List<List<ResearchTeam>> projects = generator.generateResearchProjects();
            
            departments.add(new Department(deptName, deanName, students, projects));
        }
        return departments;
    }
}