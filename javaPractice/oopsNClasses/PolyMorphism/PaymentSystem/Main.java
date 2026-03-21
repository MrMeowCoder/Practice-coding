package oopsNClasses.PolyMorphism.PaymentSystem;
import java.util.Scanner;

class Payment{
    void paying(double amount){
        System.out.println("AMOUNT HAS BEEN PAID");
    }
    double amount;
}

class cash extends Payment{
    Payment p1 = new Payment();

    @Override
    void paying(double amount){
        p1.paying(amount);
        System.out.println("Amount "+amount+" has been payed using CASH");
    }

}

class card extends Payment{
    Payment p1 = new Payment();
    @Override
    void paying(double amount){
        p1.paying(amount);
        System.out.println("Amount "+amount+" has been payed using CARD");
    }

}

class UPI extends Payment{
    Payment p1 = new Payment();
    
    @Override
    void paying(double amount){
        p1.paying(amount);
        System.out.println("Amount "+amount+" has been payed using UPI");
    }

}


public class Main{
    public static void main(String[] args){
        Payment pay;
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.print("SELECT THE PAYMENT METHOD : \n1. CASH\n2. UPI\n3. CARD\n4. EXIT\n\tSELECT ONE OF THE ABOVE : ");
            int selection = sc.nextInt();
            
            double amount = 0;
            if(selection < 4){
                System.out.print("Enter the amount : ");   
                amount = sc.nextDouble();
            }

            switch(selection){
                case 1 :
                    pay = new cash();
                    pay.paying(amount);
                    break;
                
                case 2 :
                    pay = new UPI();
                    pay.paying(amount);
                    break;

                case 3 :
                    pay = new card();
                    pay.paying(amount);
                    break;

                case 4 :
                    System.out.println("Thank you for coming here. Have a nice day!");
                    
                
                default : System.out.println("Invalid selection. pls try again");
            }
            if(selection == 4) break;
        }
        sc.close();
    }
}