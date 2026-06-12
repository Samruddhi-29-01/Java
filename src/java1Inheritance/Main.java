package java1Inheritance;

public class Main {

    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.id = 101;
        t.name = "Samruddhi";
        t.salary = 50000;

        t.exp = 5;
        t.degree = "M.Tech";

        t.display();          
        t.Markattendance();   
        t.ghyandeshktahai();  

        System.out.println("Experience: " + t.exp);
        System.out.println("Degree: " + t.degree);
    }
}