package Class19;

public class Student {
    // write a student class that have instance variables name and address.
    // create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    String name;
    String Address;
    Student(String name, String Address){
        this.name=name;
        this.Address=Address;

    }
    void displayinfo(){
        System.out.println("name "+ name+" Address "+Address);
    }

    public static void main(String[] args) {
        new Student("zakir","verginia").displayinfo();
        new Student("zak","columbus").displayinfo();
    }
}
