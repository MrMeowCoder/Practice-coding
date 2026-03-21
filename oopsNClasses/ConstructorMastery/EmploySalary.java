package oopsNClasses.ConstructorMastery;
import oopsNClasses.Inheritence.STUDENT_CLASS.Student;

public class EmploySalary extends Student{
    int id;
    String name;
    float salary;

    EmploySalary(){
        this.id = 101;
        this.name = "New Employ";
        this.salary = 34000.5f;
    }

    EmploySalary(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    float AnualSalary(){
        return this.salary*12;
    }

    void displayEmployeeInfo(){
        System.out.println("NAME : "+this.name);
        System.out.println("ID : "+this.id);
        System.out.println("SALARY : "+this.salary);
    }
}
