package oopsNClasses.Inheritence.VehicalSystem;

public class Vehicle {
    int speed;
    float fuel;

    Vehicle(int sp, float fl){
        speed = sp;
        fuel = fl;
    }



    Vehicle(){
        this.speed = 0;
        this.fuel = 0.0f;
    }

    void ViewSpeed(){
        System.out.println("Vehicle speed is : "+this.speed);
    }

    void ViewFuelCapacity(){
        System.out.println("Vehicle Fule Capacity is : "+this.fuel);
    }

    void ViewVehicalInfo(){
        System.out.println("Vehicle Fule Capacity is : "+this.fuel+ " Liter");
        System.out.println("Vehicle speed is : "+this.speed+" KM/H");
    }
}
