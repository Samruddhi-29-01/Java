package java1;

public class EmployeeManagement {

    private boolean insurance;
    private int workingDays;
    private double appraisal;
    private String role;

    public EmployeeManagement(boolean insurance, int workingDays,
                              double appraisal, String role) {
        this.insurance = insurance;
        this.workingDays = workingDays;
        this.appraisal = appraisal;
        this.role = role;
    }

 
    public void updateWorkingDays(int days) {
        if(role.equalsIgnoreCase("Manager")) {
            workingDays = days;
            System.out.println("Manager updated working days to " + workingDays);
        }
        else {
            System.out.println("Access Denied! Only Manager can update working days.");
        }
    }

    public void showDetails() {
        System.out.println("\nRole : " + role);
        System.out.println("Working Days : " + workingDays);
        System.out.println("Insurance : " + insurance);
        System.out.println("Appraisal : " + appraisal);
    }

    public static void main(String[] args) {

        EmployeeManagement manager =
                new EmployeeManagement(true, 22, 10.0, "Manager");

        EmployeeManagement engineer =
                new EmployeeManagement(true, 20, 8.0, "Software Engineer");

        
        manager.updateWorkingDays(26);

  
        engineer.updateWorkingDays(30);

        manager.showDetails();
        engineer.showDetails();
    }
}