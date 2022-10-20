package Class19;

import java.awt.*;

public class Dog extends Animal {

    public Dog(String name, String Breed,
               String color) {
        super(name, Breed, color);
    }
}
class cat extends Animal{

    cat(String name, String Breed,
        String color){
        super(name,Breed,color);

    }

    public static void main(String[] args) {
        Dog dog=new Dog("jacky","German","Green");
                dog.printinfo();
    }
    }
