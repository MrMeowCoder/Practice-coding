package oopsNClasses.Inheritence.RECTANGLE_CLASS;

public class Rectangle {
    float length;
    float width;

    Rectangle(float l, float w){
        this.length = l;
        this.width = w;
    }

    float area(){
        return this.length * this.width;
    }

    float perimater(){
        return 2*(this.length+this.width);
    }
}