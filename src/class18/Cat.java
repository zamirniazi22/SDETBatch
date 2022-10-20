package class18;

import java.sql.SQLOutput;

public class Cat extends Animal {
    double height;
    public void printinfo(){
        System.out.println("Name "+name+" breed " +breed+" age "+age+" weight "+weight);
    }
    public Cat(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
}
