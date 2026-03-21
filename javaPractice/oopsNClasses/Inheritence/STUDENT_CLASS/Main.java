package oopsNClasses.Inheritence.STUDENT_CLASS;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student sv = new Student();
        
        while(true){

            System.out.print("\n\nSelect one of the above option : \n\n1. Add Details\n2. View Details\n3. view Grade\n\nEnter your option here : ");
            int option = sc.nextInt();
            
            switch(option){
                case 1 : 
                    sv.inputDetails(sc);
                    break;

                case 2 : 
                    sv.displayDetails();
                    break;
                
                case 3 :
                    System.out.println("Student Grade : "+sv.calculateGrade(sv.mark));
                    break;

                case 4 :
                    System.out.println("Thanking you choosing our service! have a nice day");
                    return;


                default : 
                    System.out.println("Invalid selection please select the option once again : ");

            }
        }
    }
}