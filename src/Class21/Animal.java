package Class21;

public class Animal {
    String name;
    String color;
    String breed;
    void sleep(){
        System.out.println("Animal usually sleep fo 6 hours");
    }
    void eat(){
        System.out.println("Grass and meat");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println("I like to sleep fo 20 hours" );
    }
    void eat(){
        System.out.println("I only like fish");
    }
}
class Dog extends Animal{
    void sleep() {
        System.out.println("I like to sleep fo 10 hours" );
    }
    void eat(){
        System.out.println("Dogs like meat");
    }

    public static void main(String[] args) {
        Cat cat =new Cat();
        cat.eat();
        Dog dog=new Dog();
        dog.eat();
    }
}