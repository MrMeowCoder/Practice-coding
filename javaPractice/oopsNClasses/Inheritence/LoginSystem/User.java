package oopsNClasses.Inheritence.LoginSystem;
import java.util.Scanner;
class User {
    private String password;
    private String userName;

    User(){
        userName = "123";
        password = "456";
    }

    // void Setter(String pass, String US){
    //     password = pass;
    //     userName = US;
    // }

    String getPass(){
        return password;
    }

    String getUserName(){
        return userName;
    }
}

class Main{
    
    static boolean login(User user, String name, String pass){
        // Compare credentials using equals() (more idiomatic than compareTo for equality)
        return name.equals(user.getUserName()) && pass.equals(user.getPass());
    }

    public static void main(String[] args){
        User two = new User();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n\nEnter USER ID & PASSWORD : ");

            System.out.print("ID : ");
            String name = sc.next();

            System.out.print("PASS : ");
            String pass = sc.next();

            if(login(two, name, pass)){
                System.out.println("Correct!");
                System.out.println("\n\nThank you for choosing our service");
                sc.close();
                return;
            }else{
                System.out.println("\nIncorrect ID OR PASSWORD. Please try again");
                System.out.println("Your input : \n\t"+name + " "+ pass);
                System.out.println("DataBase info : \n\t"+two.getUserName()+" "+two.getPass());
            }

        }
    }
}