package Class19;

public class Animal {
    String name;
    String Breed;
    String Color;

    public Animal(String name, String breed, String color) {
        this.name = name;
        Breed = breed;
        Color = color;
    }

    public void printinfo() {
        System.out.println("Name" + name + "Breed " + Breed + "color " + Color);

    }
}