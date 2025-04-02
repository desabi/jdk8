package util.generator.employee;

import java.util.Date;

public class Employee {
    private String name;
    private String position;
    private String department;
    private String employmentType;
    private Date hireDate;
    private Double salary;
    private Integer yearsInCompany;
    private boolean isRemote;

    // Constructor
    public Employee(String name, String position, String department, String employmentType, 
                   Date hireDate, Double salary, Integer yearsInCompany, boolean isRemote) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.employmentType = employmentType;
        this.hireDate = hireDate;
        this.salary = salary;
        this.yearsInCompany = yearsInCompany;
        this.isRemote = isRemote;
    }

    // Getters
    public String getName() { return name; }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }
    public String getEmploymentType() { return employmentType; }
    public Date getHireDate() { return hireDate; }
    public Double getSalary() { return salary; }
    public Integer getYearsInCompany() { return yearsInCompany; }
    public boolean isRemote() { return isRemote; }

    @Override
    public String toString() {
        return "{ \"name\": \"" + name + "\", \"position\": \"" + position + "\", \"department\": \"" + department + 
               "\", \"employmentType\": \"" + employmentType + "\", \"hireDate\": \"" + hireDate + 
               "\", \"salary\": " + salary + ", \"yearsInCompany\": " + yearsInCompany + 
               ", \"isRemote\": " + isRemote + " }";
    }
}