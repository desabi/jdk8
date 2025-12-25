package generators.department;

import java.util.List;

public class Department {
    private String deptName;              // The first field
    private String deanName;              // The second field
    private List<Student> students;       // List of a custom java object
    // A List of Lists: Each list represents the teams within a specific Research Project
    private List<List<ResearchTeam>> researchProjects;

    public Department(String deptName, String deanName, List<Student> students,
        List<List<ResearchTeam>> researchProjects) {
        this.deptName = deptName;
        this.deanName = deanName;
        this.students = students;
        this.researchProjects = researchProjects;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<List<ResearchTeam>> getResearchProjects() {
        return researchProjects;
    }

    public void setResearchProjects(
        List<List<ResearchTeam>> researchProjects) {
        this.researchProjects = researchProjects;
    }

    @Override
    public String toString() {
        return String.format(
            "{\n  \"deptName\": \"%s\",\n  \"deanName\": \"%s\",\n  \"students\": %s,\n  \"researchProjects\": %s\n}",
            deptName, deanName, students, researchProjects
        );
    }
}