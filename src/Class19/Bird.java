package Class19;

import com.sun.tools.javac.Main;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }


    void printinfo() {
        System.out.println("Name " + name + "color " + color + "age " + age + " weight " + weight);
    }
}
    class parrot extends Bird {
        parrot(String name, String color, int age, double weight) {
            super(name, color, age, weight);
           /* this.name = name;
            this.color = color;
            this.age = age;
            this.weight = weight;*/
        }
        }
class crow extends Bird {
    crow (String name, String color, int age, double weight) {
        super(name, color, age, weight);
       /* this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
    }
}
class sparrow extends Bird {
    sparrow(String name, String color, int age, double weight) {
        super(name, color, age, weight);
        /*this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
    }
}
                class Test {
                public static void main(String[] args) {
                    parrot par = new parrot("zaki", "green", 2, 10);
                    par.printinfo();
                    crow crow = new crow("crow", "black", 5, 12);
                    crow.printinfo();
                    sparrow sparrow = new sparrow("sparrow", "red", 4, 8);
                    sparrow.printinfo();
                }



        }

