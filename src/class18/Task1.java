package class18;

public class Task1 {

    //Write a java class that will have a constructor: one with parameters and second without any parameters.
   // Create a separate Test class where you will execute both of the constructors 1 by 1.

public Task1(){
    System.out.println("empty");
}
   public Task1(String str) {
       System.out.println("str =" + str);
   }

    public static void main(String[] args) {
        Task1 task=new Task1("Java");
    }
}
