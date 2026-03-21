package oopsNClasses.Inheritence.BankAccount;
import java.util.Scanner;
public class AcInfo extends Protect{
    String bankNumber;
    String holderName;
    float balance;

    Protect p1 = new Protect();
    Scanner sc = new Scanner(System.in);
    void ViewInfo(){
        System.out.println("AC NUMBER : "+bankNumber);
        System.out.println("HOLDER NAME : "+holderName);
        System.out.println("BALANCE : "+balance);
    }

    AcInfo(){

        while(true){
            System.out.print("Enter Account PIN and USER name : ");
            int pin = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            
            if(pin != p1.getterPin() && name.compareTo(p1.getterMail()) == 0){
                System.out.println("\n\nInvalid User name or Password. Try Again\n");
            }else{
                break;
            }
        }

        bankNumber = "100200";
        holderName = "New Member";
        balance = 10.3f;
        
    }

    AcInfo(String bNo, String name, float bal){
         while(true){
            System.out.print("Enter Account PIN and USER name : ");
            int pin = sc.nextInt();
            sc.nextLine();
            String name1 = sc.nextLine();
            
            if(pin != p1.getterPin() && name1.compareTo(p1.getterMail()) == 0){
                System.out.println("\n\nInvalid User name or Password. Try Again\n");
            }else{
                break;
            }
        }
        bankNumber = bNo;
        holderName = name;
        balance = bal;
    }

    float deposit(Scanner sc){
        System.out.print("Enter the amount : ");
        float amount = sc.nextFloat();
        if(amount <= 0){
            System.out.println("\nMinimunt Deposit 1Rs\n");
            return 0;
        }
        System.out.println("\nAmount Deposited Sucessfully\n");
        balance+=amount;
        return balance;
    }

    float withdraw(Scanner sc){
        System.out.print("Enter the amount : ");
        float amount = sc.nextFloat();

        if(amount > balance){
            System.out.println("\nNo sufficent balance\n");
            return 0;
        }else if(balance - amount <= 1000){
            System.out.println("\nMinimunt balance must be mantained\n");
            return 0;
        }
        System.out.println("\nAmount Withdrawn Sucessfully\n");
        balance-=amount;
        return balance;
    }

    void displayBalance(){
        System.out.println("\nYour current balance is : "+balance+"\n\nThank you for choosing Royals Bank.\n");
    }
}

class Protect{
    private int pin;
    private String mail;

    Protect(){
        this.pin = 938094;
        this.mail = "abc@gmail.com";
    }
    
    void Setter(int pin){
        this.pin = pin;
    }

    void Setter(String mail){
        this.mail = mail;
    }

    int getterPin(){
        return pin;
    }

    String getterMail(){
        return mail;
    }
}
