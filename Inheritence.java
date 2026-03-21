class parent {
    int age;
    String name;
    float hight;

    parent(){
        age = 18;
        name ="Ali";
        hight = 5.5f;
    }

    parent(int age, String name){
        this.age = age;
        this.name = name;
        this.hight = 5.5f;
    }

    parent(int age){
        this.age = age;
        name ="Ali";
        hight = 5.5f;
    }

    parent(int age, String name, float hight){
        this.age = age;
        this.name = name;
        this.hight = hight;
    }

    parent(parent copyInfo){
        this.age = copyInfo.age;
        this.name = copyInfo.name;
        this.hight = copyInfo.hight;
    }

    void displayInfo(){
        System.out.println("Name : "+this.name+"\nAge : "+this.age+"\nHight : "+this.hight);
    }
}

class child extends parent{
    Boolean Male;
    child(int age, String name, float hight, Boolean MaleGender){
        super(age, name, hight);

        Male = MaleGender;
    }

    child(){
        
    }

    void displayInfo(){
        System.out.println("Name : "+this.name+"\nAge : "+this.age+"\nHight : "+this.hight+"\nGender : "+this.Male);
    }
}

class Demo{
    int age;
    float hight;
    String name;
    boolean married;

    Demo(int age, float hight, String name, boolean married){
        this.age = age;
        this.hight = hight;
        this.name = name;
        this.married = married;
    }

    Demo(){
        this (12, 5.5f, "Veerendra", true);
    }

    Demo(int age, String name){
        this.age = age;
        this.name = name;
    }

    Demo(Demo d){
        this.age = d.age;
        this.hight = d.hight;
        this.name = d.name;
        this.married = d.married;
    }
}