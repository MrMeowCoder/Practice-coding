package oopsNClasses.Inheritence.BankAccount;
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        AcInfo a1[] = new AcInfo[4];

        a1[0] = new AcInfo();
        a1[3] = new AcInfo();

        for(int i = 0; i<3; i++){
            if(i == 1) continue;

            System.out.print("Enter id : ");
            String id = sc.nextLine();

            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Balance : ");
            float balance = sc.nextFloat();
            sc.nextLine();
            System.out.println();
            
            a1[i] = new AcInfo(id, name, balance);
        }

        // for(int i = 0 ; i<4; i++){
        //     a1[i].ViewInfo();
        //     System.out.println();
        // }

        sc.close();
    }
}