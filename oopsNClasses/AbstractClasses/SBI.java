package oopsNClasses.AbstractClasses;
import java.util.Scanner;
public class SBI extends ATM{
    String id = "It's me";

    Scanner scan = new Scanner(System.in);
    
    @Override
    public void deposit(){
        System.out.println("=== WELCOME TO SBI ATM ===");

        System.out.print("Enter your password : ");
        String pass = scan.nextLine();
        if(pass.compareTo(id) == 0){
            System.out.println("Enter the amount you want to deposit : ");
            int amount = scan.nextInt();
            super.balance += amount;
        }else{
            System.out.println("password is incorrect please try again!");
        }
    }
    
    @Override
    public void withdraw(){
        System.out.println("=== WELCOME TO SBI ATM ===");

        System.out.print("Enter your password : ");
        String pass = scan.nextLine();
        if(pass.compareTo(id) == 0){
            System.out.println("Enter the amount you want to withdraw : ");
            int amount = scan.nextInt();
            super.balance -= amount;
        }else{
            System.out.println("password is incorrect please try again!");
        }
    }
}

