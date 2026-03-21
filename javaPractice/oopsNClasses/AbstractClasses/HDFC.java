package oopsNClasses.AbstractClasses;

import java.util.Scanner;
public class HDFC extends ATM{
    String name = "maadu";
    Scanner scan = new Scanner(System.in);

    public void deposit(){
        System.out.println("=== WELCOME TO HDFC ATM ===");
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        if(name.compareTo(this.name) == 0){
            System.out.println("Enter the amount you want to deposit : ");
            int amount = scan.nextInt();
            super.balance += amount;
        }else{
            System.out.println("name is incorrect please try again!");
        }
    }

    public void withdraw(){
        System.out.println("=== WELCOME TO HDFC ATM ===");

        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        if(name.compareTo(this.name) == 0){
            System.out.println("Enter the amount you want to withdraw : ");
            int amount = scan.nextInt();
            super.balance -= amount;
        }else{
            System.out.println("name is incorrect please try again!");
        }
    }

}