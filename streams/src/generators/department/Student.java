package generators.department;

public class Student {
    private String name;
    private int age;
    private double gpa;
    private String major;

    public Student(String name, int age, double gpa, String major) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
    }

    // Getters are essential for Stream method references (e.g., Student::getGpa)
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }

    @Override
    public String toString() {
        return String.format(
            "{\"name\": \"%s\", \"age\": %d, \"gpa\": %.2f, \"major\": \"%s\"}",
            name, age, gpa, major
        );
    }
}