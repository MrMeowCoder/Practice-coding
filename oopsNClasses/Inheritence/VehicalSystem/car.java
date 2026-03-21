package oopsNClasses.Inheritence.VehicalSystem;                                 

public class car extends Vehicle{                                 
    String brand;                                 
    float mileage;                                 

    car(){                                 
        this.brand = "NEW CAR";
        this.mileage = 0.0f;
        super.fuel = 0.0f;
        super.speed = 0;
    }

    car(String brand, float mileage, float fuel, int speed){
        super(speed, fuel);
        this.brand = brand;
        this.mileage = mileage;
    }

    car(String brand, float mileage){                                 
        this.brand = brand;                                 
        this.mileage = mileage;                                 
    }                                 

    void ViewBrand(){                                 
        System.out.println("Car Brand name is : "+this.brand);                                 
    }                                 

    void ViewMileage(){                                 
        System.out.println("Mileage is the Car is : "+this.mileage);                                 
    }                          
    
    void ViewVehicalInfo(){
        super.ViewVehicalInfo();
        System.out.println("Vehicle Brand : "+this.brand);
        System.out.println("Vehicle Mielage : "+this.mileage);
    }
}                                 
