package class18;

public class Task03 {
   // Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and create 4 objects of this class:
      //  1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.


  private Task03(){
      System.out.println("private");
    }
   public Task03(String name){
       System.out.println("public");
    }
    Task03(int age){
        System.out.println("default");
    }
   protected Task03(boolean IsTrue){
       System.out.println("protected");
    }

    public static void main(String[] args) {
        new Task03();
        new Task03("ZAMIR");
        new Task03(9);
        new Task03(true);
    }
}
