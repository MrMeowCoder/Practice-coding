package AccessStudent;
import java.util.Scanner;

public class Student{
    public static String name;
    public static int id;
    public static float marks;
    public static boolean pass;

    // public Student(String name, int id, float marks, boolean result){
    //     this.name = name;
    //     this.id = id;
    //     this.marks = marks;
    //     this.pass = result;
    // }

    public Student(){

    }

    public static void DisplayInfo(){
        
        while(true){
            int option;
            System.out.print("\n\n1. VIEW NAME\n2. VIEW ID\n3. VIEW MARKS\n4. VIEW RESULT\n5. EXIT\nSELECT ON OF THE BILLOW OPTIONS : ");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch(option){
                case 1 : System.out.println(Student.name);
                break;
                
                case 2 : System.out.println(Student.id);
                break;
                
                case 3 : System.out.println(marks);
                break;
                
                case 4 : System.out.println(pass == true? "PASSED" : "FAILED");
                break;
                
                case 5 : System.out.println("Invalid option. choose the options from 1 - 5");
                sc.close();
            }
            if(option == 5) return;
        }
    }
}