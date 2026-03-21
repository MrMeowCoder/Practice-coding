package ProtationClass;
import AccessStudent.AddInfo;
class Superaa{
    int size;
    String name;
    int arr[];

    Superaa(){

    }

    Superaa(int size, String name){
        this.size = size;
        this.name = name;

        this.arr = new int[size];
    }
}

class A extends AddInfo{
    AddInfo X = new AddInfo();
    int x = X.num;
}

public class Super{
    public static void main(String[] args){
        Superaa s1 = new Superaa();
        System.out.println(s1.getClass().hashCode());
    }
}