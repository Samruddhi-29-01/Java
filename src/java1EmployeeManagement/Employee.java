package java1EmployeeManagement;
abstract class Employee {

    int employeeId;
    String name;
    double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateAnnualSalary();
}