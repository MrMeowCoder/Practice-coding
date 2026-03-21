package oopsNClasses.Inheritence.STUDENT_CLASS;
import java.util.Scanner;
public class Student{
    int rollno;
    String name;
    float mark;


    void inputDetails(Scanner sc){
        System.out.println("\nEnter the details as per following instruction : \n");
        System.out.print("Enter Role Number : ");
        this.rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Full Name : ");
        this.name = sc.nextLine();

        System.out.print("Enter marks : ");
        this.mark = sc.nextFloat();
    }

    public void displayDetails(){
        System.out.println("Student name is : "+name);
        System.out.println("Student Roll Number is : "+rollno);
        System.out.println("Student's total marks is : "+mark);
    }

    char calculateGrade(float mark){
        char grade = ' ';
        int gradeMark = (int) mark;
        switch(gradeMark/10){
            case 10 : grade = 'A';
            break;

            case 9 : grade = 'B';
            break;

            case 8 : grade = 'C';
            break;

            case 7 : grade = 'D';
            break;

            case 6 : grade = 'E';
            break;

            case 5 : 
            case 4 : 
            case 3 : 
            case 2 : 
            case 1 : grade = 'F';
            break;
        }

        return grade;
    }
}