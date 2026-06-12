package java1EmployeeManagement;
class Marketing extends Employee {

    double incentive;

    Marketing(int employeeId, String name, double salary, double incentive) {
        super(employeeId, name, salary);
        this.incentive = incentive;
    }

    @Override
    double calculateAnnualSalary() {
        return salary + incentive;
    }
}