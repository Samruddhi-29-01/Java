package java1EmployeeManagement;
public class Main {

    public static void main(String[] args) {

        Developer dev1 = new Developer(101, "Amit", 50000, 10000);
        Developer dev2 = new Developer(102, "Rahul", 50000, 5000);

        HR hr = new HR(201, "Priya", 40000, 8000);

        Marketing m = new Marketing(301, "Rohan", 45000, 7000);

        System.out.println("Developer Annual Salary = "
                + dev1.calculateAnnualSalary());

        System.out.println("HR Annual Salary = "
                + hr.calculateAnnualSalary());

        System.out.println("Marketing Annual Salary = "
                + m.calculateAnnualSalary());

        System.out.println("dev1 equals dev2 = "
                + dev1.equals(dev2));
    }
}