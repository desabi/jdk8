package util.generator.employee;

import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Company {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Department> departments = new ArrayList<>();

        // --- Executive Department ---
        Department executiveDept = new Department();
        executiveDept.addEmployee(new Employee("John", "CEO", "Executive", "Full-time", sdf.parse("2010-05-15"), 250000.0, 13, false));
        executiveDept.addEmployee(new Employee("Sarah", "CTO", "Executive", "Full-time", sdf.parse("2015-08-20"), 220000.0, 8, true));
        executiveDept.addEmployee(new Employee("Michael", "CFO", "Executive", "Full-time", sdf.parse("2012-03-10"), 210000.0, 11, false));
        executiveDept.addEmployee(new Employee("Emily", "COO", "Executive", "Full-time", sdf.parse("2018-11-05"), 200000.0, 5, true));
        executiveDept.addEmployee(new Employee("David", "CMO", "Executive", "Full-time", sdf.parse("2016-07-22"), 190000.0, 7, false));
        executiveDept.addEmployee(new Employee("Robert", "VP Sales", "Executive", "Full-time", sdf.parse("2019-04-18"), 180000.0, 4, true));
        executiveDept.addEmployee(new Employee("Lisa", "VP Marketing", "Executive", "Full-time", sdf.parse("2017-09-30"), 175000.0, 6, false));
        executiveDept.addEmployee(new Employee("Paul", "VP Engineering", "Executive", "Full-time", sdf.parse("2014-01-15"), 185000.0, 9, true));
        executiveDept.addEmployee(new Employee("Anna", "Chief of Staff", "Executive", "Full-time", sdf.parse("2020-02-10"), 160000.0, 3, false));
        executiveDept.addEmployee(new Employee("Kevin", "VP Product", "Executive", "Full-time", sdf.parse("2013-06-25"), 195000.0, 10, true));
        departments.add(executiveDept);

        // --- Engineering Department ---
        Department engineeringDept = new Department();
        engineeringDept.addEmployee(new Employee("Alex", "Senior Developer", "Engineering", "Full-time", sdf.parse("2018-04-12"), 145000.0, 5, true));
        engineeringDept.addEmployee(new Employee("Priya", "Senior Developer", "Engineering", "Full-time", sdf.parse("2019-07-22"), 135000.0, 4, false));
        engineeringDept.addEmployee(new Employee("James", "DevOps Engineer", "Engineering", "Full-time", sdf.parse("2020-03-15"), 125000.0, 3, true));
        engineeringDept.addEmployee(new Employee("Sophia", "QA Engineer", "Engineering", "Full-time", sdf.parse("2021-01-10"), 115000.0, 2, false));
        engineeringDept.addEmployee(new Employee("Daniel", "Mobile Developer", "Engineering", "Full-time", sdf.parse("2017-11-05"), 130000.0, 6, true));
        engineeringDept.addEmployee(new Employee("Emma", "Junior Developer", "Engineering", "Full-time", sdf.parse("2022-06-18"), 95000.0, 1, false));
        engineeringDept.addEmployee(new Employee("Ryan", "Junior Developer", "Engineering", "Intern", sdf.parse("2023-02-01"), 60000.0, 0, true));
        engineeringDept.addEmployee(new Employee("Olivia", "Frontend Developer", "Engineering", "Contract", sdf.parse("2021-09-14"), 110000.0, 2, true));
        engineeringDept.addEmployee(new Employee("Liam", "Backend Developer", "Engineering", "Full-time", sdf.parse("2019-05-20"), 140000.0, 4, false));
        engineeringDept.addEmployee(new Employee("Ava", "Systems Architect", "Engineering", "Full-time", sdf.parse("2015-12-08"), 160000.0, 8, true));
        departments.add(engineeringDept);

        // --- Creative Department ---
        Department creativeDept = new Department();
        creativeDept.addEmployee(new Employee("Mia", "Lead Designer", "Creative", "Full-time", sdf.parse("2016-08-30"), 120000.0, 7, false));
        creativeDept.addEmployee(new Employee("Lucas", "UI/UX Designer", "Creative", "Full-time", sdf.parse("2019-10-15"), 105000.0, 4, true));
        creativeDept.addEmployee(new Employee("Ethan", "Graphic Designer", "Creative", "Part-time", sdf.parse("2020-04-22"), 85000.0, 3, true));
        creativeDept.addEmployee(new Employee("Isabella", "Graphic Designer", "Creative", "Full-time", sdf.parse("2018-07-11"), 95000.0, 5, false));
        creativeDept.addEmployee(new Employee("Noah", "Video Editor", "Creative", "Contract", sdf.parse("2021-03-05"), 90000.0, 2, true));
        creativeDept.addEmployee(new Employee("Sophia", "Content Writer", "Creative", "Full-time", sdf.parse("2017-12-18"), 80000.0, 6, false));
        creativeDept.addEmployee(new Employee("Jackson", "Content Writer", "Creative", "Part-time", sdf.parse("2022-01-10"), 70000.0, 1, true));
        creativeDept.addEmployee(new Employee("Aria", "Social Media Manager", "Creative", "Full-time", sdf.parse("2019-09-25"), 85000.0, 4, true));
        creativeDept.addEmployee(new Employee("Logan", "Motion Designer", "Creative", "Full-time", sdf.parse("2020-11-30"), 110000.0, 3, false));
        creativeDept.addEmployee(new Employee("Zoe", "Illustrator", "Creative", "Contract", sdf.parse("2021-07-15"), 95000.0, 2, true));
        departments.add(creativeDept);

        // Print the JSON structure
        System.out.println("{");
        System.out.println("  \"departments\": [");
        for (int i = 0; i < departments.size(); i++) {
            System.out.println("    " + departments.get(i).toString() + (i < departments.size() - 1 ? "," : ""));
        }
        System.out.println("  ]");
        System.out.println("}");
    }
}