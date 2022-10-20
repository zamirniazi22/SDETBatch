package class17;

import java.sql.SQLOutput;

public class person {
    String Name;
    String Color;
    String Country;
    int age;
    double weight;
    String hairColor;
    String eyeColor;
    double height;
    char gender;

    public person(String name, String color, String country, int age, double weight, String hairColor, String eyeColor, double height, char gender) {
        Name = name;
        Color = color;
        Country = country;
        this.age = age;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.gender = gender;
    }
    void printinfo(){
        System.out.println("name "+" "+Name+" color  " + Color+ " Country "+ Country+" age "+age+" weight "+ weight+" hair color "+hairColor+" eyeColor "+eyeColor+" height "+ height+" gender "+gender);
    }



    public static void main(String[] args) {
        person person =new person("zamir","white","Afghanistan",30,65,"brown","brown",170,'M');
        person.printinfo();
    }
}
