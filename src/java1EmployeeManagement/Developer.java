package java1EmployeeManagement;
class Developer extends Employee {

    double bonus;

    Developer(int employeeId, String name, double salary, double bonus) {
        super(employeeId, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateAnnualSalary() {
        return salary + bonus;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Developer) {
            Developer d = (Developer) obj;
            return this.salary == d.salary;
        }

        return false;
    }
}