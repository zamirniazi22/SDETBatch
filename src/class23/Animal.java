package class23;

public abstract class Animal {
    abstract void eat();

   abstract void sleep();
   void walk(){
       System.out.println("Cat walk");
   }

}
class Cat extends Animal {
    void eat() {
        System.out.println("Cats like fish");
    }

    void sleep() {
        System.out.println("Cat likes to sleep for 10 jours ");
    }
}
class dog extends Animal{
    void eat(){
        System.out.println("Cats like Watermelon");
    }
    void sleep(){
        System.out.println("Cat likes to sleep for 10  to 8 jours ");
    }

    public static void main(String[] args) {
        //Animal animal= new Animal(); objects are not allowed in abstract class
        // animal.eat();
    }
}