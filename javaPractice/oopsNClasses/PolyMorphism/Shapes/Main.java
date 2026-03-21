package oopsNClasses.PolyMorphism.Shapes;

class Primary{
    void On(){
        System.out.println("It's now ON");
    }

    void Off(){
        System.out.println("It's now OFF");
    }
}

class Secondry extends Primary{
    @Override
    void On(){
        System.out.println("Second phone is now ON");
    }
    
    void Off(){
        System.out.println("Second phone is now OFF");
    }

    static void reboot(){
        System.out.println("It's now beeing rebooted");
    }
}

public class Main {
    public static void main(String[] args){
        Primary one = new Primary();
        Secondry two = new Secondry();
        Primary both = new Secondry();

        two.Off();
        Secondry.reboot();
        one.Off();
        both.Off();
    }
}
