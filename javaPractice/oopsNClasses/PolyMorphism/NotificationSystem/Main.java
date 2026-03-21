package oopsNClasses.PolyMorphism.NotificationSystem;
import java.util.*;
class Notification {
    void send(){
        System.out.println("Notification has been sent!");
    }
}

class EmailNotification extends Notification{
    void send(){
        super.send();
        System.out.println("Trough Email");
    }
}

class SMSNotification extends Notification{
    void send(){
        super.send();
        System.out.println("Trough SMS");
    }
}

class PushNotification extends Notification{
    void send(){
        super.send();
        System.out.println("Trough PUSH");
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Notification alert;
        while(true){

            System.out.print("SELECT THE NOTIFICATION METHOD : \n1. Email\n2. SMS\n3. PUSH\n4. EXIT\n\tSELECT ONE OF THE ABOVE : ");
            int selection = sc.nextInt();
        
            switch(selection){
                case 1 :
                    alert = new EmailNotification();
                    alert.send();
                    break;
                
                case 2 :
                    alert = new SMSNotification();
                    alert.send();
                    break;

                case 3 :
                    alert = new PushNotification();
                    alert.send();
                    break;

                case 4 :
                    System.out.println("Thank you for coming here. Have a nice day!");
                    break;
                
                default : System.out.println("Invalid selection. pls try again");
            }
            if(selection == 4) break;
        }
        sc.close();
    }
}