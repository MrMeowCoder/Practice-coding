package oopsNClasses.Inheritence.RECTANGLE_CLASS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r[] = new Rectangle[3];

        float len = 0.0f;
        float wid = 0.0f;

        for(int i = 0; i<3; i++){
            System.out.print("Enter length & width of the object number "+(i+1)+" : ");
            len = sc.nextFloat();
            wid = sc.nextFloat();

            r[i] = new Rectangle(len, wid);
            
        }
        LargestAres(r);
        sc.close();
    }

    static void LargestAres(Rectangle r[]){
        float LarAr = r[0].area();
        int largestIndex = 0;
        for(int i = 0; i<r.length; i++){
            if(r[i].area() > LarAr){
                LarAr = r[i].area();
                largestIndex = i;
            }
        }
        System.out.println("Largest area is : "+LarAr+" in the obeject number : "+(largestIndex+1));
    }
}