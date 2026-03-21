package oopsNClasses.Inheritence.VehicalSystem;

public class bike extends car{
    String type;

    bike(){
        type = "New Bike";
        this.fuel = 0.0f;
        this.speed = 0;
    }

    bike(String type, float fuel, int speed){
        this.type = type;
        this.fuel = fuel;
        this.speed = speed;
    }

    void ViewBikeType(){
        System.out.println("Bike type is : "+this.type);
    }

    void ViewVehicalInfo(){
        super.ViewVehicalInfo();
        System.out.println("Bike type is : "+this.type);
    }

    bike(String brand, float mileage, float fuel, int speed, String type){
        super(brand, mileage, fuel, speed);
        this.type = type;
    }
}
