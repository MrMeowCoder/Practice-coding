package AccessStudent;

public class VerifyInfo{
    public static void checkinfo(String name){
        System.out.print("Enter the name of the Student : ");
        Student.name = name;
        if(Student.name  == name ){
            System.out.println("Entered Information is Correct!");
        }else{
            System.out.println("Information doesn't match check the informaton you entered and Try again.");
        }
    }
    
    public static void checkinfo(int id){
        System.out.print("Enter the name of the Student : ");
        Student.id = id;
       if(Student.id  == id ){
        System.out.println("Entered Information is Correct!");
       }else{
        System.out.println("Information doesn't match check the informaton you entered and Try again.");
       }

    }
    
    public static void checkinfo(float marks){
        System.out.print("Enter the name of the Student : ");
        Student.marks = marks;
        if(Student.marks  == marks){
            System.out.println("Entered Information is Correct!");
        }else{
            System.out.println("Information doesn't match check the informaton you entered and Try again.");
        }

    }
    
    public static void checkinfo(boolean result){
        System.out.print("Enter the name of the Student : ");
        Student.pass = result;
        if(Student.pass  == result){
            System.out.println("Entered Information is Correct!");
        }else{
            System.out.println("Information doesn't match check the informaton you entered and Try again.");
        }

    }
}