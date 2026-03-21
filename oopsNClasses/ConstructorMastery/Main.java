package oopsNClasses.ConstructorMastery;
import oopsNClasses.Inheritence.STUDENT_CLASS.Student;

public class Main extends Student{

    public static void main(String[] args) {
        EmploySalary emp1 = new EmploySalary(100, "Arjun", 50000.5f);
        emp1.displayEmployeeInfo();
        System.out.println("First Employe's Anual Salary is : "+emp1.AnualSalary());
        System.out.println();System.out.println();
        
        EmploySalary emp2 = new EmploySalary();
        emp2.displayEmployeeInfo();
        System.out.println("Second Employe's Anual Salary is : "+emp2.AnualSalary());
        System.out.println();System.out.println();

        EmploySalary emp3 = new EmploySalary(103, "Rahul", 10000f);
        emp3.displayEmployeeInfo();
        System.out.println("Third Employe's Anual Salary is : "+emp3.AnualSalary());
        System.out.println();System.out.println();

    }
}
