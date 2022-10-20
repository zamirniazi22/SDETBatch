package Class19;
class Vehicle {
    int noOfwheels;
    int topspeed;

    void printTopspeed() {
        System.out.println("Topspeed");
    }

    public class Car extends Vehicle {
        String model;
        String make;
        int year;

    }

    class Tesla extends class18.Car {
        void printinfo() {
            System.out.println("I am electrical car");
        }
    }

    class Toyota extends Car {
        void printinfo() {
            System.out.println("I am a combination engine car");
        }

        class Tester {

        }

        public void main(String[] args) {
            Toyota toyota = new Toyota();
            toyota.printTopspeed();
        }
    }
}