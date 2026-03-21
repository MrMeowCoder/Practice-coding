package AccessStudent;


public class AddInfo{
    
    public int num;
    String name;
    int arr[];

    public static void putinfo(String name){
        
        Student.name = name;
        System.out.println("Student NAME is saved sucessfully\n");

    }
    
    public static void putinfo(int id){
        
        Student.id = id;
        System.out.println("Student ID is saved sucessfully\n");

    }
    
    public static void putinfo(float marks){
        
        Student.marks = marks;
        System.out.println("Student MARKS is saved sucessfully\n");

    }
    
    public static void putinfo(boolean result){
        
        Student.pass = result;
        System.out.println("Student RESULT is saved sucessfully\n");

    }
    
}