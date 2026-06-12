package java1EmployeeManagement;
class HR extends Employee {

    double allowance;

    HR(int employeeId, String name, double salary, double allowance) {
        super(employeeId, name, salary);
        this.allowance = allowance;
    }

    @Override
    double calculateAnnualSalary() {
        return salary + allowance;
    }
}