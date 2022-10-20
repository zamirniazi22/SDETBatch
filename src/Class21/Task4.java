package Class21;

public class Task4 {
    // Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.


   private static void print(){
        System.out.println("empty");

    }

    private static void print(String name){
        System.out.println("name"+name);
    }

    private static void print(String name,int age){
        System.out.println("I love"+name+" because she is nice "+ age);


    }

    public static void main(String[] args) {

        print();
        print("Rani");
        print("Rani",21);
    }
}

